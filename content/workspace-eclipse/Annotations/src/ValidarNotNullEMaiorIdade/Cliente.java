package ValidarNotNullEMaiorIdade;

public class Cliente {
	@NotNull(conteudo = "") private String nome;
	private String sobreNome;
	@NotNull(conteudo = "") private String email;
	@isMaior private int idade;
	public Cliente(String nome, String sobreNome, String email, int idade) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.email = email;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public String getEmail() {
		return email;
	}
	public int getIdade() {
		return idade;
	}
}
