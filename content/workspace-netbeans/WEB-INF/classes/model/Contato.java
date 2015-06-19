package model;

import java.io.Serializable;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
    @NamedQuery(name = "Contato.listarTodos",
            query = "select c from Contato c"),
    @NamedQuery(name = "Contato.consultarPorNome",
            query = "select c from Contato c where c.nomeContato=?1")
})
public class Contato implements Serializable {

    @Id
    private String email;
    private String nomeContato;
    @Convert
    private Telefone telefone;
    @ManyToOne
    private Usuario usuario;

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
