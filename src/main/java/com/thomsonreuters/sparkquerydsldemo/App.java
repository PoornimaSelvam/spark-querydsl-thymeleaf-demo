package com.thomsonreuters.sparkquerydsldemo;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.staticFiles;
import static spark.Spark.stop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.querydsl.core.Tuple;
import com.querydsl.sql.Configuration;
import com.querydsl.sql.OracleTemplates;
import com.querydsl.sql.SQLQuery;
import com.querydsl.sql.SQLTemplates;
import com.querydsl.sql.dml.SQLUpdateClause;
import com.thomsonreuters.cawcc.QSubjects;

import spark.ModelAndView;
import spark.Response;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

public class App {

	public static void main(String[] args) {
		staticFiles.location("/static");
		
		post("/subjects", (req,res) -> findSubjectSearchTerm(req.queryParams("subject"), res), new ThymeleafTemplateEngine());
		
		post("/replace", (req,res) -> updateSubjectSearchTerm(req.queryParams("subject"), req.queryParams("replace"), res), new ThymeleafTemplateEngine());
		
		post("stop", (req, res) -> {stop(); return "OK";});
	}

	private static ModelAndView updateSubjectSearchTerm(String subjectTerm, String replaceTerm, Response res) {
		Connection connection = getDbConnection(res);
		List<Tuple> subjectTerms = updateSubjectTextByReplaceText(subjectTerm, replaceTerm, connection);
		Map<String, List<Tuple>> map = constructResultMap(subjectTerms);
		return new ModelAndView(map, "searchResults");
	}

	private static List<Tuple> updateSubjectTextByReplaceText(String subjectTerm, String replaceTerm,
			Connection connection) {
		SQLTemplates dialect = new OracleTemplates();
		Configuration configuration = new Configuration(dialect);
		QSubjects subjects = new QSubjects("s");
		
		SQLUpdateClause updateClause= new SQLUpdateClause(connection, configuration, subjects)
											.where(subjects.subjectText.like("%" + subjectTerm + "%"))
											.set(subjects.subjectText, replaceTerm);
		updateClause.execute();
		List<Tuple> subjectTerms = getSubjectBySubjectText(replaceTerm, connection);
		return subjectTerms;
	}

	private static ModelAndView findSubjectSearchTerm(String subjectTerm, Response res) {
		Connection connection = getDbConnection(res);
		List<Tuple> subjectTerms = getSubjectBySubjectText(subjectTerm, connection);
		Map<String, List<Tuple>> map = constructResultMap(subjectTerms);
		return new ModelAndView(map, "searchResults");
	}
	
	private static Map<String, List<Tuple>> constructResultMap(List<Tuple> subjectTerms) {
		Map<String, List<Tuple>> map = new HashMap<>();
		map.put("subjectTerms", subjectTerms);
		return map;
	}

	private static List<Tuple> getSubjectBySubjectText(String subjectTerm, Connection connection) {
		SQLTemplates dialect = new OracleTemplates();
		SQLQuery<?> query = new SQLQuery<Void>(connection, dialect);
		QSubjects subjects = new QSubjects("s");
		List<Tuple> subjectTerms = query.select(subjects.searchterm, subjects.subjectId, subjects.subjectText)
				.from(subjects)
				.where(subjects.subjectText.like("%" + subjectTerm + "%"))
				.fetch();
		return subjectTerms;
	}

	private static Connection getDbConnection(Response res) {
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(  
					"jdbc:oracle:thin:@ukmy-clientsupdb-01.tlr.thomson.com:1521:uka05a1","CAWCC_ADMIN","s044947660");
		} catch (Exception e) {
			e.printStackTrace();
			res.status(500);
			res.body(e.getMessage());
		}
		return connection;
	}
}
