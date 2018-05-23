package com.thomsonreuters.cawcc;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QKeywords is a Querydsl query type for QKeywords
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QKeywords extends com.querydsl.sql.RelationalPathBase<QKeywords> {

    private static final long serialVersionUID = 1122284697;

    public static final QKeywords keywords = new QKeywords("KEYWORDS");

    public final DateTimePath<java.sql.Timestamp> dateEnd = createDateTime("dateEnd", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateStart = createDateTime("dateStart", java.sql.Timestamp.class);

    public final StringPath isselectable = createString("isselectable");

    public final NumberPath<Long> keywordId = createNumber("keywordId", Long.class);

    public final StringPath lawtelEuSubject = createString("lawtelEuSubject");

    public final StringPath lawtelSubject = createString("lawtelSubject");

    public final StringPath searchterm = createString("searchterm");

    public final NumberPath<Long> thesaurId = createNumber("thesaurId", Long.class);

    public final StringPath thesterm = createString("thesterm");

    public final StringPath word = createString("word");

    public QKeywords(String variable) {
        super(QKeywords.class, forVariable(variable), "CAWCC_ADMIN", "KEYWORDS");
        addMetadata();
    }

    public QKeywords(String variable, String schema, String table) {
        super(QKeywords.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QKeywords(String variable, String schema) {
        super(QKeywords.class, forVariable(variable), schema, "KEYWORDS");
        addMetadata();
    }

    public QKeywords(Path<? extends QKeywords> path) {
        super(path.getType(), path.getMetadata(), "CAWCC_ADMIN", "KEYWORDS");
        addMetadata();
    }

    public QKeywords(PathMetadata metadata) {
        super(QKeywords.class, metadata, "CAWCC_ADMIN", "KEYWORDS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateEnd, ColumnMetadata.named("DATE_END").withIndex(10).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(dateStart, ColumnMetadata.named("DATE_START").withIndex(9).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(isselectable, ColumnMetadata.named("ISSELECTABLE").withIndex(5).ofType(Types.CHAR).withSize(1));
        addMetadata(keywordId, ColumnMetadata.named("KEYWORD_ID").withIndex(1).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(lawtelEuSubject, ColumnMetadata.named("LAWTEL_EU_SUBJECT").withIndex(8).ofType(Types.VARCHAR).withSize(250));
        addMetadata(lawtelSubject, ColumnMetadata.named("LAWTEL_SUBJECT").withIndex(7).ofType(Types.VARCHAR).withSize(250));
        addMetadata(searchterm, ColumnMetadata.named("SEARCHTERM").withIndex(6).ofType(Types.VARCHAR).withSize(250));
        addMetadata(thesaurId, ColumnMetadata.named("THESAUR_ID").withIndex(2).ofType(Types.DECIMAL).withSize(10));
        addMetadata(thesterm, ColumnMetadata.named("THESTERM").withIndex(3).ofType(Types.VARCHAR).withSize(250));
        addMetadata(word, ColumnMetadata.named("WORD").withIndex(4).ofType(Types.VARCHAR).withSize(250));
    }

}

