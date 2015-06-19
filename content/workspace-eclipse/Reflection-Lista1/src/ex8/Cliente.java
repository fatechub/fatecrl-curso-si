package ex8;

public class Cliente {
	private String nome;
	private int idade;
	public Cliente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Nome: " + nome + " Idade: " + idade;
	}
}

