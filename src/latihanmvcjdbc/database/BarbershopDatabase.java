/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvcjdbc.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import latihanmvcjdbc.impl.PelangganDaoImpl;
import latihanmvcjdbc.service.PelangganDao;

/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * NIM   : 10119053
 * Kelas : IF - 2
 */
public class BarbershopDatabase {
    
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            MysqlDataSource datasource = new MysqlDataSource();
            datasource.setUrl("jdbc:mysql://localhost:3306/barbershop");
            datasource.setUser("root");
            datasource.setPassword("");
            connection = datasource.getConnection();
        } 
        return connection;
    }
    
    public static PelangganDao getPelangganDao() throws SQLException {
        if (pelangganDao == null) {
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        return pelangganDao;
    }
}
