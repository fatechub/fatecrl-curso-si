package testaconexao2java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    private static final String DATABASE_URL = "jdbc:mysql://localhost/ciro_db"; // "jdbc:mysql://localhost/dps"; //
    private static final String DATABASE_USER = "root"; // "root"; //
    private static final String DATABASE_PASSWORD = ""; // "fatec"; //
    
    public Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection( DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD );
        } catch(SQLException e) {
            throw e;
        }
    }
    
}
