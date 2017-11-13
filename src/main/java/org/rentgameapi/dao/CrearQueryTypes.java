package org.rentgameapi.dao;

import com.querydsl.sql.codegen.MetaDataExporter;
import java.io.File;
import java.sql.SQLException;

import javax.sql.DataSource;


import java.sql.Connection;

public class CrearQueryTypes {
	
    public static void crearQueryTypes(DataSource dataSource){
        
        Connection conn;

        try {
            //System.out.println(dataSource.getConnection());
            conn = dataSource.getConnection();
            System.out.println("antes del metadata");
            MetaDataExporter exporter = new MetaDataExporter();
            System.out.println("despues del metadata");
            exporter.setPackageName("org.rentgameapi.querydsl");
            exporter.setTargetFolder(new File("target/generated-sources/java"));
            exporter.export(conn.getMetaData());

        } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        };
    }
}
