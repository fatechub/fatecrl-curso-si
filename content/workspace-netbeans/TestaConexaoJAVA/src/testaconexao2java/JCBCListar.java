package testaconexao2java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JCBCListar {

    public static void main(String[] args) throws
            SQLException {
        // conectando
        Connection con = new ConnectionFactory().getConnection();
        // cria um preparedStatement
        String sql = "select * from contatos order by nome";
        PreparedStatement stmt
                = con.prepareStatement(sql);
        // executa a consulta
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) { // itera sobre o ResultSet
            // recupera os campos de cada registro
            Long id = rs.getLong("id");
            String nome = rs.getString("nome");
            String email = rs.getString("email");
            String endereco = rs.getString("endereco");
            System.out.println(id + " - " + nome + " - " + email + " - " + endereco);
        }
        stmt.close();
        con.close();
    }
}
