package ex7;

public class Cliente {
	private String nome;
	@Senha 
	private String senha;
	public Cliente(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " Senha: " + senha;
	}
}
