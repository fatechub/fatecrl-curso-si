package tpgarciapersistenciatipocliente;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {
	
	@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
	private String nome;
	private double anuidade;
        @Enumerated(EnumType.STRING)
	private TipoCartao tipoCartao;
        
        public Cliente() {}
        
        public Cliente(int id, String nome, double anuidade, TipoCartao tipoCartao) {
		this.id = id;
		this.nome = nome;
		this.anuidade = anuidade;
		this.tipoCartao = tipoCartao;
	}
        
        public Cliente(String nome, double anuidade, TipoCartao tipoCartao) {
		this.nome = nome;
		this.anuidade = anuidade;
		this.tipoCartao = tipoCartao;
	}

	public int getId() {
		return id;
	}	

	public String getNome() {
		return nome;
	}

	public double getAnuidade() {
		return anuidade;
	}

	public TipoCartao getTipoCartao() {
		return tipoCartao;
	}
	
	public double calcularDesconto(){
		return anuidade * tipoCartao.anuidade();
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", anuidade="
				+ anuidade + ", tipoCartao=" + tipoCartao
				+ ", calcularDesconto()=" + calcularDesconto() + "]";
	}

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param anuidade the anuidade to set
     */
    public void setAnuidade(double anuidade) {
        this.anuidade = anuidade;
    }

    /**
     * @param tipoCartao the tipoCartao to set
     */
    public void setTipoCartao(TipoCartao tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

}
