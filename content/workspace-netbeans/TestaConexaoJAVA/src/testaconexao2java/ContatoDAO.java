package testaconexao2java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class ContatoDAO {

    private static final String SQL_INSERIR_CONTATO = "insert into contatos (nome, email, endereco) values (?,?,?)";
    private static final String SQL_LISTAR_CONTATOS = "select * from contatos order by nome";
    // a conexão com o banco de dados
    private Connection connection;

    public void adicionar(Contato contato) throws SQLException {
        try {
            connection = new ConnectionFactory().getConnection();
            try {
                PreparedStatement stmt = connection.prepareStatement(SQL_INSERIR_CONTATO);
                // seta os valores
                stmt.setString(1, contato.getNome());
                stmt.setString(2, contato.getEmail());
                stmt.setString(3, contato.getEndereco());
                // executa
                stmt.execute();
                stmt.close();
            } finally {
                connection.close();
            }
        } catch (SQLException e) {
            throw e;
        }
    }

    public List<Contato> listar() throws SQLException {
        List<Contato> contatos = new ArrayList<Contato>();
        try {
            connection = new ConnectionFactory().getConnection();
            try {
                PreparedStatement stmt = connection.prepareStatement(SQL_LISTAR_CONTATOS);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Contato c = new Contato();
                    c.setId(rs.getLong("id"));
                    c.setNome(rs.getString("nome"));
                    c.setEmail(rs.getString("email"));
                    c.setEndereco(rs.getString("endereco"));
                    contatos.add(c);
                }
                stmt.close();
                rs.close();
            } finally {
                connection.close();
            }
        } catch (SQLException e) {
            throw e;
        }
        return contatos;
    }
}
