package zoologico;

public class VisitorZooA extends VisitorZoo {

	public void visitante(Gato g) {
		System.out.println("É um gato no ZooA");
	}

	public void visitante(Cachorro c) {
		System.out.println("É um cachorro no ZooA");
	}
	// sobrecarga tempo de copilação
	// sobrescrita tempo de execução
}
