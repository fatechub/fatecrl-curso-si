package models;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Adam Macias, Flávia Souza, Ramon Duran
 */
@Entity(name = "Usuario")
@SessionScoped
@NamedQueries ({
    @NamedQuery(name = "Usuario.listarTodas", query = "select c from Usuario c"),
    @NamedQuery(name = "Usuario.consultaUsuario", query = "select c from Usuario c where c.id=?1"),
    @NamedQuery(name = "Usuario.consultaUsuarioPorLogin", query = "select c from Usuario c where c.login=?1"),
    @NamedQuery(name = "Usuario.listarContatos", query = "select c from Contato c where c.usuario=?1"),
    @NamedQuery(name = "Usuario.listarContatosPorNome", query = "select c from Contato c where c.usuario=?1 and c.nome like ?2"),
    @NamedQuery(name = "Usuario.logar", query = "select c from Usuario c where c.login=?1 and c.senha=?2")
})
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message="O Login deve ser informado!")
    private String login;
    @NotEmpty(message="A Senha deve ser informado!")
    private String senha;
    @NotEmpty(message="O Nome deve ser informado!")
    private String nome;
    @OneToMany(mappedBy = "usuario") 
    private List<Contato> contatos;

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }
    
}
