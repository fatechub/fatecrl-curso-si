package lojaVirtualPromocaoGarcia;

public abstract class Produto {
	private String nome;
	private double preco;
	private Promocao promocao;
	
	public void setPromocao(Promocao promocao) {
		this.promocao = promocao;
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public double calcularPreco(){
		return promocao.descontar()*preco;
	}
	
	public String toString(){
		return "Produto: "+nome;
	}
	
}
