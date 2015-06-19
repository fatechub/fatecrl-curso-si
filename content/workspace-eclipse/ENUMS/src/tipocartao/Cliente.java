package tipocartao;

public class Cliente {
	
	private int id;
	private String nome;
	private double anuidade;
	private TipoCartao tipoCartao;
	
	public Cliente(int id, String nome, double anuidade, TipoCartao tipoCartao) {
		super();
		this.id = id;
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

}
