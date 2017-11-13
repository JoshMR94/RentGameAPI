/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rentgameapi.api;

import com.querydsl.sql.Configuration;
import com.querydsl.sql.SQLQueryFactory;
import org.rentgameapi.querydsl.QClient;
import java.util.List;
import javax.sql.DataSource;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import org.rentgameapi.dao.Configuracion;
import org.rentgameapi.dao.CrearQueryTypes;
import org.rentgameapi.dao.MyDataSourceFactory;

/**
 * REST Web Service
 *
 * @author jmartin
 */
@Path("Client")
public class ClientResource {

    @Context
    private UriInfo context;
    
    private SQLQueryFactory queryFactory;

    /**
     * Creates a new instance of ClientResource
     */
    public ClientResource() {
        Configuration configuration = Configuracion.crearConfiguracion();
        DataSource dataSource = MyDataSourceFactory.getMySQLDataSource();
        
        CrearQueryTypes.crearQueryTypes(dataSource);
        this.queryFactory = new SQLQueryFactory(configuration, dataSource);
    }
    
    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String getPrueba() {
        return "It works!";
    }
    
    @GET
    @Path("/getClients")
    @Produces(MediaType.TEXT_PLAIN)
    public List<String> getClients() {
        QClient client = new QClient("client");

        List<String> clients = queryFactory.select(client.name).from(client)
            //.where(ciclo.abreviatura.eq("ASIR"))
            .fetch();

        return clients;    
    }

}
