package com.thomsonreuters.cawcc;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSubjects is a Querydsl query type for QSubjects
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSubjects extends com.querydsl.sql.RelationalPathBase<QSubjects> {

    private static final long serialVersionUID = -1470732874;

    public static final QSubjects subjects = new QSubjects("SUBJECTS");

    public final DateTimePath<java.sql.Timestamp> dateEnd = createDateTime("dateEnd", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateStart = createDateTime("dateStart", java.sql.Timestamp.class);

    public final StringPath isselectable = createString("isselectable");

    public final StringPath lawtelSubject = createString("lawtelSubject");

    public final StringPath legacy = createString("legacy");

    public final StringPath searchterm = createString("searchterm");

    public final NumberPath<Long> subjectId = createNumber("subjectId", Long.class);

    public final StringPath subjectText = createString("subjectText");

    public QSubjects(String variable) {
        super(QSubjects.class, forVariable(variable), "CAWCC_ADMIN", "SUBJECTS");
        addMetadata();
    }

    public QSubjects(String variable, String schema, String table) {
        super(QSubjects.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSubjects(String variable, String schema) {
        super(QSubjects.class, forVariable(variable), schema, "SUBJECTS");
        addMetadata();
    }

    public QSubjects(Path<? extends QSubjects> path) {
        super(path.getType(), path.getMetadata(), "CAWCC_ADMIN", "SUBJECTS");
        addMetadata();
    }

    public QSubjects(PathMetadata metadata) {
        super(QSubjects.class, metadata, "CAWCC_ADMIN", "SUBJECTS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateEnd, ColumnMetadata.named("DATE_END").withIndex(7).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(dateStart, ColumnMetadata.named("DATE_START").withIndex(6).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(isselectable, ColumnMetadata.named("ISSELECTABLE").withIndex(5).ofType(Types.CHAR).withSize(1));
        addMetadata(lawtelSubject, ColumnMetadata.named("LAWTEL_SUBJECT").withIndex(8).ofType(Types.VARCHAR).withSize(250));
        addMetadata(legacy, ColumnMetadata.named("LEGACY").withIndex(1).ofType(Types.CHAR).withSize(1));
        addMetadata(searchterm, ColumnMetadata.named("SEARCHTERM").withIndex(2).ofType(Types.VARCHAR).withSize(250));
        addMetadata(subjectId, ColumnMetadata.named("SUBJECT_ID").withIndex(4).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(subjectText, ColumnMetadata.named("SUBJECT_TEXT").withIndex(3).ofType(Types.VARCHAR).withSize(250));
    }

}

