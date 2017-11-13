package org.rentgameapi.querydsl;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QClient is a Querydsl query type for QClient
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QClient extends com.querydsl.sql.RelationalPathBase<QClient> {

    private static final long serialVersionUID = 589315532;

    public static final QClient client = new QClient("client");

    public final DatePath<java.sql.Date> birthDate = createDate("birthDate", java.sql.Date.class);

    public final StringPath dni = createString("dni");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final com.querydsl.sql.PrimaryKey<QClient> primary = createPrimaryKey(id);

    public QClient(String variable) {
        super(QClient.class, forVariable(variable), "null", "client");
        addMetadata();
    }

    public QClient(String variable, String schema, String table) {
        super(QClient.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QClient(Path<? extends QClient> path) {
        super(path.getType(), path.getMetadata(), "null", "client");
        addMetadata();
    }

    public QClient(PathMetadata metadata) {
        super(QClient.class, metadata, "null", "client");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(birthDate, ColumnMetadata.named("birth_date").withIndex(4).ofType(Types.DATE).withSize(10));
        addMetadata(dni, ColumnMetadata.named("dni").withIndex(2).ofType(Types.VARCHAR).withSize(9).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(3).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}

