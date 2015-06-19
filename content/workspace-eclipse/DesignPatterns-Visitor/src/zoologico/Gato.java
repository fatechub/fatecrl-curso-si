package zoologico;

final public class Gato extends Animal{ //se a classe é abstrata eu não tenho que implementar o metodo

	public Gato(String nome) {
		super(nome);
	}

	@Override
	public void emitirSom() {
		System.out.println("MIAU MIAU");
	}

	public void accept(VisitorZoo z) {
		z.visitante(this);
	}	
	//@override ela é opcional //indica pro copilador se estou faazendo a sobrescrita certa
}
