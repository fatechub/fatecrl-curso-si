package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ciro
 */
public class ConnectionFactory {
    private static final String DATABASE_URL = "jdbc:mysql://localhost/ciro_db";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "";
    
    public Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(
                    DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
        } catch(SQLException e) {
            throw e;
        }
    }
    
}
