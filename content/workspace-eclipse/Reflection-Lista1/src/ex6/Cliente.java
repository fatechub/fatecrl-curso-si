package ex6;

public class Cliente {
	private String nome;
	@Positivo 
	private int idade;
	public Cliente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
}
