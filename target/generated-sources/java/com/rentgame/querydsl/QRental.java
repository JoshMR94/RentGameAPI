package com.rentgame.querydsl;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRental is a Querydsl query type for QRental
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRental extends com.querydsl.sql.RelationalPathBase<QRental> {

    private static final long serialVersionUID = -1186317678;

    public static final QRental rental = new QRental("rental");

    public final DatePath<java.sql.Date> beginDate = createDate("beginDate", java.sql.Date.class);

    public final NumberPath<Integer> clientId = createNumber("clientId", Integer.class);

    public final DatePath<java.sql.Date> endDate = createDate("endDate", java.sql.Date.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QRental> primary = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QClient> rentalIbfk1 = createForeignKey(clientId, "id");

    public final com.querydsl.sql.ForeignKey<QGamerental> _gamerentalIbfk1 = createInvForeignKey(id, "rentalId");

    public QRental(String variable) {
        super(QRental.class, forVariable(variable), "null", "rental");
        addMetadata();
    }

    public QRental(String variable, String schema, String table) {
        super(QRental.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRental(Path<? extends QRental> path) {
        super(path.getType(), path.getMetadata(), "null", "rental");
        addMetadata();
    }

    public QRental(PathMetadata metadata) {
        super(QRental.class, metadata, "null", "rental");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(beginDate, ColumnMetadata.named("beginDate").withIndex(2).ofType(Types.DATE).withSize(10).notNull());
        addMetadata(clientId, ColumnMetadata.named("clientId").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(endDate, ColumnMetadata.named("endDate").withIndex(3).ofType(Types.DATE).withSize(10).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

