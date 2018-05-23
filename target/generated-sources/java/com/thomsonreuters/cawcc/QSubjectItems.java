package com.thomsonreuters.cawcc;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSubjectItems is a Querydsl query type for QSubjectItems
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSubjectItems extends com.querydsl.sql.RelationalPathBase<QSubjectItems> {

    private static final long serialVersionUID = 612828003;

    public static final QSubjectItems subjectItems = new QSubjectItems("SUBJECT_ITEMS");

    public final StringPath isprimary = createString("isprimary");

    public final NumberPath<Long> itemId = createNumber("itemId", Long.class);

    public final NumberPath<Long> nOrder = createNumber("nOrder", Long.class);

    public final StringPath recCraapp = createString("recCraapp");

    public final DateTimePath<java.sql.Timestamp> recCradate = createDateTime("recCradate", java.sql.Timestamp.class);

    public final StringPath recCraosuser = createString("recCraosuser");

    public final StringPath recCrapc = createString("recCrapc");

    public final StringPath recCrauser = createString("recCrauser");

    public final StringPath recModapp = createString("recModapp");

    public final DateTimePath<java.sql.Timestamp> recModdate = createDateTime("recModdate", java.sql.Timestamp.class);

    public final StringPath recModosuser = createString("recModosuser");

    public final StringPath recModpc = createString("recModpc");

    public final StringPath recModuser = createString("recModuser");

    public final NumberPath<Long> subjectId = createNumber("subjectId", Long.class);

    public final NumberPath<Long> subjitmId = createNumber("subjitmId", Long.class);

    public QSubjectItems(String variable) {
        super(QSubjectItems.class, forVariable(variable), "CAWCC_ADMIN", "SUBJECT_ITEMS");
        addMetadata();
    }

    public QSubjectItems(String variable, String schema, String table) {
        super(QSubjectItems.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSubjectItems(String variable, String schema) {
        super(QSubjectItems.class, forVariable(variable), schema, "SUBJECT_ITEMS");
        addMetadata();
    }

    public QSubjectItems(Path<? extends QSubjectItems> path) {
        super(path.getType(), path.getMetadata(), "CAWCC_ADMIN", "SUBJECT_ITEMS");
        addMetadata();
    }

    public QSubjectItems(PathMetadata metadata) {
        super(QSubjectItems.class, metadata, "CAWCC_ADMIN", "SUBJECT_ITEMS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(isprimary, ColumnMetadata.named("ISPRIMARY").withIndex(4).ofType(Types.CHAR).withSize(1));
        addMetadata(itemId, ColumnMetadata.named("ITEM_ID").withIndex(3).ofType(Types.DECIMAL).withSize(10));
        addMetadata(nOrder, ColumnMetadata.named("N_ORDER").withIndex(2).ofType(Types.DECIMAL).withSize(10));
        addMetadata(recCraapp, ColumnMetadata.named("REC_CRAAPP").withIndex(8).ofType(Types.VARCHAR).withSize(48));
        addMetadata(recCradate, ColumnMetadata.named("REC_CRADATE").withIndex(6).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(recCraosuser, ColumnMetadata.named("REC_CRAOSUSER").withIndex(10).ofType(Types.VARCHAR).withSize(30));
        addMetadata(recCrapc, ColumnMetadata.named("REC_CRAPC").withIndex(9).ofType(Types.VARCHAR).withSize(64));
        addMetadata(recCrauser, ColumnMetadata.named("REC_CRAUSER").withIndex(7).ofType(Types.VARCHAR).withSize(30));
        addMetadata(recModapp, ColumnMetadata.named("REC_MODAPP").withIndex(13).ofType(Types.VARCHAR).withSize(48));
        addMetadata(recModdate, ColumnMetadata.named("REC_MODDATE").withIndex(11).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(recModosuser, ColumnMetadata.named("REC_MODOSUSER").withIndex(15).ofType(Types.VARCHAR).withSize(30));
        addMetadata(recModpc, ColumnMetadata.named("REC_MODPC").withIndex(14).ofType(Types.VARCHAR).withSize(64));
        addMetadata(recModuser, ColumnMetadata.named("REC_MODUSER").withIndex(12).ofType(Types.VARCHAR).withSize(30));
        addMetadata(subjectId, ColumnMetadata.named("SUBJECT_ID").withIndex(5).ofType(Types.DECIMAL).withSize(10));
        addMetadata(subjitmId, ColumnMetadata.named("SUBJITM_ID").withIndex(1).ofType(Types.DECIMAL).withSize(10).notNull());
    }

}

