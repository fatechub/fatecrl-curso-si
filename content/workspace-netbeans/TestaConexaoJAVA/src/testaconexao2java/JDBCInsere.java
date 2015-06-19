package testaconexao2java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCInsere {
    public static void main(String[] args) throws SQLException {
        if (args.length == 3) {
            Connection con = new ConnectionFactory().getConnection();
            String sql = "insert into contatos (nome, email, endereco) values (?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, args[0]);
            stmt.setString(2, args[1]);
            stmt.setString(3, args[2]);
            stmt.execute();
            stmt.close();
            con.close();
            System.out.println("Contato inserido com sucesso");
        } else {
            System.out.println("Forneça os valores via argumentos da main");
        }
    }
    
}
