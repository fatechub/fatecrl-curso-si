package ex2;

public class Cliente {
	private String nome;
	
	public Cliente(String nome, String SobreNome) {
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void mostrarNome(){
		System.out.println(nome);
	}
}
