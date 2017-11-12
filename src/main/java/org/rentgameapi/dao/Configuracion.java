package org.rentgameapi.dao;

import com.querydsl.sql.Configuration;
import com.querydsl.sql.MySQLTemplates;
import com.querydsl.sql.SQLTemplates;

public class Configuracion {
    
    public static Configuration crearConfiguracion(){
        
        SQLTemplates templates = new MySQLTemplates();
        Configuration configuration = new Configuration(templates);

        return configuration;
    }
	
//	static void crearConfiguracionPersonalizada(){
//		MySQLTemplates.builder()
//	     .printSchema() // to include the schema in the output
//	     .quote()       // to quote names
//	     .newLineToSingleSpace() // to replace new lines with single space in the output
//	     .escape("\\")    // to set the escape char
//	     .build();      // to get the customized SQLTemplates instance
//	}
}
