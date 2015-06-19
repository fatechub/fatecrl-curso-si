package models;

import java.io.Serializable; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne; 
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Adam Macias, Flávia Souza, Ramon Duran
 */
@Entity
public class Contato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message="O Nome deve ser informado!")
    private String nome;
    @Pattern(regexp = "[0-9]+", message="Digite apenas numeros!")
    @Length(min=2, max=11, message="O telefone deve conter 8 a 11 digitos!")
    private String telefone;
    @NotEmpty(message="O Email deve ser informado!")
    @Email(message="Informe um Email válido!")
    private String email;
    @ManyToOne
    private Usuario usuario;

    public Contato() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }   
    
}
