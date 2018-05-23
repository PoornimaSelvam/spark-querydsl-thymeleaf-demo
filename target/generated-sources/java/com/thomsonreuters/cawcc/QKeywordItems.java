package com.thomsonreuters.cawcc;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QKeywordItems is a Querydsl query type for QKeywordItems
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QKeywordItems extends com.querydsl.sql.RelationalPathBase<QKeywordItems> {

    private static final long serialVersionUID = 532490438;

    public static final QKeywordItems keywordItems = new QKeywordItems("KEYWORD_ITEMS");

    public final NumberPath<Long> itemId = createNumber("itemId", Long.class);

    public final NumberPath<Long> keyitmId = createNumber("keyitmId", Long.class);

    public final NumberPath<Long> keywordId = createNumber("keywordId", Long.class);

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

    public QKeywordItems(String variable) {
        super(QKeywordItems.class, forVariable(variable), "CAWCC_ADMIN", "KEYWORD_ITEMS");
        addMetadata();
    }

    public QKeywordItems(String variable, String schema, String table) {
        super(QKeywordItems.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QKeywordItems(String variable, String schema) {
        super(QKeywordItems.class, forVariable(variable), schema, "KEYWORD_ITEMS");
        addMetadata();
    }

    public QKeywordItems(Path<? extends QKeywordItems> path) {
        super(path.getType(), path.getMetadata(), "CAWCC_ADMIN", "KEYWORD_ITEMS");
        addMetadata();
    }

    public QKeywordItems(PathMetadata metadata) {
        super(QKeywordItems.class, metadata, "CAWCC_ADMIN", "KEYWORD_ITEMS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(itemId, ColumnMetadata.named("ITEM_ID").withIndex(2).ofType(Types.DECIMAL).withSize(10));
        addMetadata(keyitmId, ColumnMetadata.named("KEYITM_ID").withIndex(4).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(keywordId, ColumnMetadata.named("KEYWORD_ID").withIndex(3).ofType(Types.DECIMAL).withSize(10));
        addMetadata(nOrder, ColumnMetadata.named("N_ORDER").withIndex(1).ofType(Types.DECIMAL).withSize(10));
        addMetadata(recCraapp, ColumnMetadata.named("REC_CRAAPP").withIndex(7).ofType(Types.VARCHAR).withSize(48));
        addMetadata(recCradate, ColumnMetadata.named("REC_CRADATE").withIndex(5).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(recCraosuser, ColumnMetadata.named("REC_CRAOSUSER").withIndex(9).ofType(Types.VARCHAR).withSize(30));
        addMetadata(recCrapc, ColumnMetadata.named("REC_CRAPC").withIndex(8).ofType(Types.VARCHAR).withSize(64));
        addMetadata(recCrauser, ColumnMetadata.named("REC_CRAUSER").withIndex(6).ofType(Types.VARCHAR).withSize(30));
        addMetadata(recModapp, ColumnMetadata.named("REC_MODAPP").withIndex(12).ofType(Types.VARCHAR).withSize(48));
        addMetadata(recModdate, ColumnMetadata.named("REC_MODDATE").withIndex(10).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(recModosuser, ColumnMetadata.named("REC_MODOSUSER").withIndex(14).ofType(Types.VARCHAR).withSize(30));
        addMetadata(recModpc, ColumnMetadata.named("REC_MODPC").withIndex(13).ofType(Types.VARCHAR).withSize(64));
        addMetadata(recModuser, ColumnMetadata.named("REC_MODUSER").withIndex(11).ofType(Types.VARCHAR).withSize(30));
    }

}

