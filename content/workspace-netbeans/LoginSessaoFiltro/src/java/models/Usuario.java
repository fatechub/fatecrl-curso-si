package models;

import java.io.Serializable;
import javax.faces.bean.SessionScoped;

@SessionScoped
public class Usuario implements Serializable {

    private Long id;
    private String login;
    private String senha;
    private String nome;

    public Usuario() {}
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}
