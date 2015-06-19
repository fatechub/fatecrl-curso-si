package testaconexao2java;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

    public static void main(String[] args) {
        ConnectionFactory cf = new ConnectionFactory();
        try {
            Connection con = cf.getConnection();
            System.out.println("Conexão aberta!");
            con.close();
        } catch (SQLException e) {
            System.out.println("Falha na conexão: " + e.getMessage());
        }
    }
    
}
