package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import controller.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ciro
 */
public class ContatoDAO {
    private static final String SQL_INSERIR_CONTATO = 
            "insert into contatos (nome, email, endereco) values (?,?,?)";
    private static final String SQL_LISTAR_CONTATOS =
            "select * from contatos order by nome";
    private static final String SQL_CONSULTAR_CONTATOS =
            "select * from contatos where nome like ? order by nome";
    private Connection con;
    
    public void adicionar(Contato contato) throws SQLException {
        try {
            con = new ConnectionFactory().getConnection();
            try {
                PreparedStatement stmt = con.prepareStatement(SQL_INSERIR_CONTATO);
                stmt.setString(1, contato.getNome());
                stmt.setString(2, contato.getEmail());
                stmt.setString(3, contato.getEndereco());
                stmt.execute();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (SQLException ex) {
            throw ex;
        }
    }
    
    public List<Contato> listar() throws SQLException {
        List<Contato> contatos = new ArrayList<>();
        try {
            con = new ConnectionFactory().getConnection();
            try {
                PreparedStatement stmt = con.prepareStatement(SQL_LISTAR_CONTATOS);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Contato c = new Contato();
                    c.setId(rs.getLong("id"));
                    c.setNome(rs.getString("nome"));
                    c.setEmail(rs.getString("email"));
                    c.setEndereco(rs.getString("endereco"));
                    contatos.add(c);
                }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return contatos;
    }

    public List<Contato> consultar(String nome) throws SQLException {
        List<Contato> contatos = new ArrayList<>();
        try {
            con = new ConnectionFactory().getConnection();
            try {
                PreparedStatement stmt = con.prepareStatement(SQL_CONSULTAR_CONTATOS);
                stmt.setString(1, "%"+nome+"%");
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Contato c = new Contato();
                    c.setId(rs.getLong("id"));
                    c.setNome(rs.getString("nome"));
                    c.setEmail(rs.getString("email"));
                    c.setEndereco(rs.getString("endereco"));
                    contatos.add(c);
                }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return contatos;
    }

    
}
