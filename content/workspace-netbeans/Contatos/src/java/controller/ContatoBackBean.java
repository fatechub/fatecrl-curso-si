/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Contato;
import model.ContatoDAO;

/**
 *
 * @author ciro
 */
@ManagedBean
@SessionScoped
public class ContatoBackBean {
    private Contato contato = new Contato();
    private List<Contato> contatos = new ArrayList<>();
    private String message;
    
    /**
     * Creates a new instance of ContatoBackBean
     */
    public ContatoBackBean() {
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String cadastrar() {
        ContatoDAO cdao = new ContatoDAO();
        try {
            cdao.adicionar(contato);
            contato = new Contato();
            return null;
        } catch (SQLException ex) {
            message = ex.getMessage();
            return "/erro";
        }
    }
    
    public List<Contato> getContatosCadastrados() throws SQLException {
        ContatoDAO cdao = new ContatoDAO();
        contatos = cdao.listar();
        return contatos;
    }
    
    public String consultar() throws SQLException {
        ContatoDAO cdao = new ContatoDAO();
        contatos = cdao.consultar(contato.getNome());
        return null;
    }
}
