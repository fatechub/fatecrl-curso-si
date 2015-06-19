/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financas.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author ciro
 */
@Entity
@NamedQueries ({
    @NamedQuery(name = "Conta.listarTodas", 
                query = "select c from Conta c"),
    @NamedQuery(name = "Conta.consultarPorNome",
                query = "select c from Conta c where c.titular=?1")
}
)
public class Conta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titular;
    private String numero;
    private String agencia;
    private String banco;
    @OneToMany(mappedBy = "conta")
    private List<Movimentacao> movimentacoes;

    public Conta() {
    }

    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(List<Movimentacao> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "Conta{" + "id=" + id + ", titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + ", banco=" + banco + '}';
    }    
    
}
