package com.thomsonreuters.cawcc;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QItems is a Querydsl query type for QItems
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QItems extends com.querydsl.sql.RelationalPathBase<QItems> {

    private static final long serialVersionUID = 760123697;

    public static final QItems items = new QItems("ITEMS");

    public final NumberPath<Long> acn = createNumber("acn", Long.class);

    public final StringPath areacode = createString("areacode");

    public final NumberPath<Long> batchId = createNumber("batchId", Long.class);

    public final StringPath bookauth = createString("bookauth");

    public final StringPath bookedition = createString("bookedition");

    public final StringPath bookeditor = createString("bookeditor");

    public final StringPath bookfrequency = createString("bookfrequency");

    public final StringPath bookisbn = createString("bookisbn");

    public final StringPath bookpage = createString("bookpage");

    public final StringPath bookprice = createString("bookprice");

    public final StringPath bookpublisher = createString("bookpublisher");

    public final StringPath bookreviewer = createString("bookreviewer");

    public final StringPath bookseries = createString("bookseries");

    public final StringPath booktitle = createString("booktitle");

    public final StringPath bookvolumes = createString("bookvolumes");

    public final StringPath catscite = createString("catscite");

    public final DateTimePath<java.sql.Timestamp> checkedDate = createDateTime("checkedDate", java.sql.Timestamp.class);

    public final StringPath citation = createString("citation");

    public final StringPath citpages = createString("citpages");

    public final StringPath contact = createString("contact");

    public final DateTimePath<java.sql.Timestamp> delukcadate = createDateTime("delukcadate", java.sql.Timestamp.class);

    public final StringPath email = createString("email");

    public final StringPath excludelrdi = createString("excludelrdi");

    public final StringPath extsourcepk = createString("extsourcepk");

    public final DateTimePath<java.sql.Timestamp> firstukcadate = createDateTime("firstukcadate", java.sql.Timestamp.class);

    public final StringPath format = createString("format");

    public final DateTimePath<java.sql.Timestamp> hasukcarecord = createDateTime("hasukcarecord", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> indexedDate = createDateTime("indexedDate", java.sql.Timestamp.class);

    public final StringPath isdeleted = createString("isdeleted");

    public final StringPath isenglish = createString("isenglish");

    public final StringPath isirish = createString("isirish");

    public final NumberPath<Long> itemId = createNumber("itemId", Long.class);

    public final StringPath lawtelDocno = createString("lawtelDocno");

    public final DateTimePath<java.sql.Timestamp> lawtelLoadDate = createDateTime("lawtelLoadDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> noftxjiDate = createDateTime("noftxjiDate", java.sql.Timestamp.class);

    public final StringPath publDate = createString("publDate");

    public final StringPath publishable = createString("publishable");

    public final DateTimePath<java.sql.Timestamp> publishedDate = createDateTime("publishedDate", java.sql.Timestamp.class);

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

    public final NumberPath<Long> recnum = createNumber("recnum", Long.class);

    public final DateTimePath<java.sql.Timestamp> sentalerterdate = createDateTime("sentalerterdate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> sentfjidate = createDateTime("sentfjidate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> sentforkeyingdate = createDateTime("sentforkeyingdate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> senthkcadate = createDateTime("senthkcadate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> sentiecadate = createDateTime("sentiecadate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> sentlawteldate = createDateTime("sentlawteldate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> sentljidate = createDateTime("sentljidate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> sentlrdidate = createDateTime("sentlrdidate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> sentToLawtel = createDateTime("sentToLawtel", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> sentukcadate = createDateTime("sentukcadate", java.sql.Timestamp.class);

    public final StringPath shorttitle = createString("shorttitle");

    public final NumberPath<Long> subtypeId = createNumber("subtypeId", Long.class);

    public final NumberPath<Long> typeId = createNumber("typeId", Long.class);

    public final StringPath url = createString("url");

    public QItems(String variable) {
        super(QItems.class, forVariable(variable), "CAWCC_ADMIN", "ITEMS");
        addMetadata();
    }

    public QItems(String variable, String schema, String table) {
        super(QItems.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QItems(String variable, String schema) {
        super(QItems.class, forVariable(variable), schema, "ITEMS");
        addMetadata();
    }

    public QItems(Path<? extends QItems> path) {
        super(path.getType(), path.getMetadata(), "CAWCC_ADMIN", "ITEMS");
        addMetadata();
    }

    public QItems(PathMetadata metadata) {
        super(QItems.class, metadata, "CAWCC_ADMIN", "ITEMS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(acn, ColumnMetadata.named("ACN").withIndex(10).ofType(Types.DECIMAL).withSize(10));
        addMetadata(areacode, ColumnMetadata.named("AREACODE").withIndex(32).ofType(Types.VARCHAR).withSize(200));
        addMetadata(batchId, ColumnMetadata.named("BATCH_ID").withIndex(4).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(bookauth, ColumnMetadata.named("BOOKAUTH").withIndex(24).ofType(Types.VARCHAR).withSize(500));
        addMetadata(bookedition, ColumnMetadata.named("BOOKEDITION").withIndex(28).ofType(Types.VARCHAR).withSize(250));
        addMetadata(bookeditor, ColumnMetadata.named("BOOKEDITOR").withIndex(23).ofType(Types.VARCHAR).withSize(500));
        addMetadata(bookfrequency, ColumnMetadata.named("BOOKFREQUENCY").withIndex(30).ofType(Types.VARCHAR).withSize(250));
        addMetadata(bookisbn, ColumnMetadata.named("BOOKISBN").withIndex(19).ofType(Types.VARCHAR).withSize(250));
        addMetadata(bookpage, ColumnMetadata.named("BOOKPAGE").withIndex(29).ofType(Types.VARCHAR).withSize(250));
        addMetadata(bookprice, ColumnMetadata.named("BOOKPRICE").withIndex(27).ofType(Types.VARCHAR).withSize(80));
        addMetadata(bookpublisher, ColumnMetadata.named("BOOKPUBLISHER").withIndex(20).ofType(Types.VARCHAR).withSize(500));
        addMetadata(bookreviewer, ColumnMetadata.named("BOOKREVIEWER").withIndex(25).ofType(Types.VARCHAR).withSize(500));
        addMetadata(bookseries, ColumnMetadata.named("BOOKSERIES").withIndex(22).ofType(Types.VARCHAR).withSize(500));
        addMetadata(booktitle, ColumnMetadata.named("BOOKTITLE").withIndex(26).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(bookvolumes, ColumnMetadata.named("BOOKVOLUMES").withIndex(21).ofType(Types.VARCHAR).withSize(250));
        addMetadata(catscite, ColumnMetadata.named("CATSCITE").withIndex(9).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(checkedDate, ColumnMetadata.named("CHECKED_DATE").withIndex(14).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(citation, ColumnMetadata.named("CITATION").withIndex(5).ofType(Types.VARCHAR).withSize(500));
        addMetadata(citpages, ColumnMetadata.named("CITPAGES").withIndex(6).ofType(Types.VARCHAR).withSize(100));
        addMetadata(contact, ColumnMetadata.named("CONTACT").withIndex(33).ofType(Types.VARCHAR).withSize(500));
        addMetadata(delukcadate, ColumnMetadata.named("DELUKCADATE").withIndex(59).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(email, ColumnMetadata.named("EMAIL").withIndex(31).ofType(Types.VARCHAR).withSize(500));
        addMetadata(excludelrdi, ColumnMetadata.named("EXCLUDELRDI").withIndex(63).ofType(Types.CHAR).withSize(1));
        addMetadata(extsourcepk, ColumnMetadata.named("EXTSOURCEPK").withIndex(50).ofType(Types.VARCHAR).withSize(100));
        addMetadata(firstukcadate, ColumnMetadata.named("FIRSTUKCADATE").withIndex(49).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(format, ColumnMetadata.named("FORMAT").withIndex(18).ofType(Types.VARCHAR).withSize(500));
        addMetadata(hasukcarecord, ColumnMetadata.named("HASUKCARECORD").withIndex(61).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(indexedDate, ColumnMetadata.named("INDEXED_DATE").withIndex(15).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(isdeleted, ColumnMetadata.named("ISDELETED").withIndex(17).ofType(Types.CHAR).withSize(1));
        addMetadata(isenglish, ColumnMetadata.named("ISENGLISH").withIndex(48).ofType(Types.CHAR).withSize(1));
        addMetadata(isirish, ColumnMetadata.named("ISIRISH").withIndex(47).ofType(Types.CHAR).withSize(1));
        addMetadata(itemId, ColumnMetadata.named("ITEM_ID").withIndex(1).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(lawtelDocno, ColumnMetadata.named("LAWTEL_DOCNO").withIndex(53).ofType(Types.VARCHAR).withSize(9));
        addMetadata(lawtelLoadDate, ColumnMetadata.named("LAWTEL_LOAD_DATE").withIndex(55).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(noftxjiDate, ColumnMetadata.named("NOFTXJI_DATE").withIndex(60).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(publDate, ColumnMetadata.named("PUBL_DATE").withIndex(8).ofType(Types.VARCHAR).withSize(400));
        addMetadata(publishable, ColumnMetadata.named("PUBLISHABLE").withIndex(16).ofType(Types.CHAR).withSize(1));
        addMetadata(publishedDate, ColumnMetadata.named("PUBLISHED_DATE").withIndex(45).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(recCraapp, ColumnMetadata.named("REC_CRAAPP").withIndex(37).ofType(Types.VARCHAR).withSize(64));
        addMetadata(recCradate, ColumnMetadata.named("REC_CRADATE").withIndex(35).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(recCraosuser, ColumnMetadata.named("REC_CRAOSUSER").withIndex(39).ofType(Types.VARCHAR).withSize(30));
        addMetadata(recCrapc, ColumnMetadata.named("REC_CRAPC").withIndex(38).ofType(Types.VARCHAR).withSize(64));
        addMetadata(recCrauser, ColumnMetadata.named("REC_CRAUSER").withIndex(36).ofType(Types.VARCHAR).withSize(30));
        addMetadata(recModapp, ColumnMetadata.named("REC_MODAPP").withIndex(42).ofType(Types.VARCHAR).withSize(64));
        addMetadata(recModdate, ColumnMetadata.named("REC_MODDATE").withIndex(40).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(recModosuser, ColumnMetadata.named("REC_MODOSUSER").withIndex(44).ofType(Types.VARCHAR).withSize(30));
        addMetadata(recModpc, ColumnMetadata.named("REC_MODPC").withIndex(43).ofType(Types.VARCHAR).withSize(64));
        addMetadata(recModuser, ColumnMetadata.named("REC_MODUSER").withIndex(41).ofType(Types.VARCHAR).withSize(30));
        addMetadata(recnum, ColumnMetadata.named("RECNUM").withIndex(58).ofType(Types.DECIMAL).withSize(10));
        addMetadata(sentalerterdate, ColumnMetadata.named("SENTALERTERDATE").withIndex(46).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(sentfjidate, ColumnMetadata.named("SENTFJIDATE").withIndex(12).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(sentforkeyingdate, ColumnMetadata.named("SENTFORKEYINGDATE").withIndex(56).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(senthkcadate, ColumnMetadata.named("SENTHKCADATE").withIndex(62).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(sentiecadate, ColumnMetadata.named("SENTIECADATE").withIndex(52).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(sentlawteldate, ColumnMetadata.named("SENTLAWTELDATE").withIndex(57).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(sentljidate, ColumnMetadata.named("SENTLJIDATE").withIndex(11).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(sentlrdidate, ColumnMetadata.named("SENTLRDIDATE").withIndex(51).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(sentToLawtel, ColumnMetadata.named("SENT_TO_LAWTEL").withIndex(54).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(sentukcadate, ColumnMetadata.named("SENTUKCADATE").withIndex(13).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(shorttitle, ColumnMetadata.named("SHORTTITLE").withIndex(7).ofType(Types.VARCHAR).withSize(500));
        addMetadata(subtypeId, ColumnMetadata.named("SUBTYPE_ID").withIndex(2).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(typeId, ColumnMetadata.named("TYPE_ID").withIndex(3).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(url, ColumnMetadata.named("URL").withIndex(34).ofType(Types.VARCHAR).withSize(1000));
    }

}

