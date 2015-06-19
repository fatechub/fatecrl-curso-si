package lojafabricacarroversaoadam;

public abstract class Carro {
	private int id;
	private String nome;
	private double preco;
	private Cor c;
	
	Carro(int id, String nome, double preco, Cor c) {		
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.c = c;
	}
	
	public String toString(){
		return "id = " + id + " nome = " + nome + " preco = " + preco + " cor = " + c.getClass().getSimpleName() + " tipo = "+ this.getClass().getSimpleName();
	}
	
}
