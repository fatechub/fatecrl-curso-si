package zoologico;

public class VisitorZoo {

	public void visitante(Gato g) {
		System.out.println("É um gato");
	}

	public void visitante(Cachorro c) {
		System.out.println("É um cachorro");
	}
	// sobrecarga tempo de copilação
	// sobrescrita tempo de execução
}
