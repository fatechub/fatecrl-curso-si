package zoologico;

abstract public class Animal {
	private String nome;

	public Animal(String nome) {
		this.nome = nome;
	}

	abstract public void emitirSom();

	abstract public void accept(VisitorZoo z);

	public String getNome() {
		return nome;
	}
}
