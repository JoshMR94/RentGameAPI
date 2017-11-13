package org.rentgameapi.dao;

// https://www.journaldev.com/2509/java-datasource-jdbc-datasource-example

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

//import oracle.jdbc.pool.OracleDataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class MyDataSourceFactory {

	public static DataSource getMySQLDataSource() {
            
            Properties props = new Properties();
            FileInputStream fis = null;
            MysqlDataSource mysqlDS = null;
            
            try {
                System.out.println("antes del properties");
                fis = new FileInputStream("C:\\src\\ProyectoRentGame\\RentGameAPIQueryDSL\\RentGameAPI\\src\\main\\java\\org\\rentgameapi\\dao\\db.properties");
                System.out.println("despues del properties");
                props.load(fis);
                mysqlDS = new MysqlDataSource();
                mysqlDS.setURL(props.getProperty("MYSQL_DB_URL"));
                mysqlDS.setUser(props.getProperty("MYSQL_DB_USERNAME"));
                mysqlDS.setPassword(props.getProperty("MYSQL_DB_PASSWORD"));
                
            } catch (IOException e) {
                    e.printStackTrace();
            }
            
            return mysqlDS;
	}
	
//	public static DataSource getOracleDataSource(){
//		Properties props = new Properties();
//		FileInputStream fis = null;
//		OracleDataSource oracleDS = null;
//		try {
//			fis = new FileInputStream("db.properties");
//			props.load(fis);
//			oracleDS = new OracleDataSource();
//			oracleDS.setURL(props.getProperty("ORACLE_DB_URL"));
//			oracleDS.setUser(props.getProperty("ORACLE_DB_USERNAME"));
//			oracleDS.setPassword(props.getProperty("ORACLE_DB_PASSWORD"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return oracleDS;
//	}
		
}
