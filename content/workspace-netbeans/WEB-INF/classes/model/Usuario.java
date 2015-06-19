package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name="Usuario.consultaLogin", 
            query = "select u from Usuario u where u.nomeUsuario=?1 and u.senha = ?2")
public class Usuario implements Serializable{
    
    @Id
    private String nomeUsuario;
    private String senha;
    private String nomeCompleto;
    @OneToMany(mappedBy = "usuario")
    private List<Contato> contatos;
    
    public Usuario(){}
  
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    } 

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

   
}
