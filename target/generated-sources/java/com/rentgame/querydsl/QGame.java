package com.rentgame.querydsl;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QGame is a Querydsl query type for QGame
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QGame extends com.querydsl.sql.RelationalPathBase<QGame> {

    private static final long serialVersionUID = 1996197088;

    public static final QGame game = new QGame("game");

    public final StringPath genre = createString("genre");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Double> price = createNumber("price", Double.class);

    public final DatePath<java.sql.Date> releaseDate = createDate("releaseDate", java.sql.Date.class);

    public final StringPath title = createString("title");

    public final com.querydsl.sql.PrimaryKey<QGame> primary = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QGamerental> _gamerentalIbfk2 = createInvForeignKey(id, "gameId");

    public QGame(String variable) {
        super(QGame.class, forVariable(variable), "null", "game");
        addMetadata();
    }

    public QGame(String variable, String schema, String table) {
        super(QGame.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGame(Path<? extends QGame> path) {
        super(path.getType(), path.getMetadata(), "null", "game");
        addMetadata();
    }

    public QGame(PathMetadata metadata) {
        super(QGame.class, metadata, "null", "game");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(genre, ColumnMetadata.named("genre").withIndex(2).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(price, ColumnMetadata.named("price").withIndex(5).ofType(Types.DOUBLE).withSize(3).withDigits(2));
        addMetadata(releaseDate, ColumnMetadata.named("releaseDate").withIndex(4).ofType(Types.DATE).withSize(10).notNull());
        addMetadata(title, ColumnMetadata.named("title").withIndex(3).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}

