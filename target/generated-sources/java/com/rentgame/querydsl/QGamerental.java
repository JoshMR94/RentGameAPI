package com.rentgame.querydsl;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QGamerental is a Querydsl query type for QGamerental
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QGamerental extends com.querydsl.sql.RelationalPathBase<QGamerental> {

    private static final long serialVersionUID = 149021188;

    public static final QGamerental gamerental = new QGamerental("gamerental");

    public final NumberPath<Integer> gameId = createNumber("gameId", Integer.class);

    public final NumberPath<Integer> rentalId = createNumber("rentalId", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QGamerental> primary = createPrimaryKey(gameId, rentalId);

    public final com.querydsl.sql.ForeignKey<QRental> gamerentalIbfk1 = createForeignKey(rentalId, "id");

    public final com.querydsl.sql.ForeignKey<QGame> gamerentalIbfk2 = createForeignKey(gameId, "id");

    public QGamerental(String variable) {
        super(QGamerental.class, forVariable(variable), "null", "gamerental");
        addMetadata();
    }

    public QGamerental(String variable, String schema, String table) {
        super(QGamerental.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGamerental(Path<? extends QGamerental> path) {
        super(path.getType(), path.getMetadata(), "null", "gamerental");
        addMetadata();
    }

    public QGamerental(PathMetadata metadata) {
        super(QGamerental.class, metadata, "null", "gamerental");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(gameId, ColumnMetadata.named("gameId").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(rentalId, ColumnMetadata.named("rentalId").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

