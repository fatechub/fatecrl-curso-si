package zoologico;

public class VisitorZooB extends VisitorZoo{
	
	public void visitante(Gato g){
		System.out.println("É um gato no ZooB");
	}
	
	public void visitante(Cachorro c){
		System.out.println("É um cachorro no ZooB");
	}
	//sobrecarga tempo de copilação
	//sobrescrita tempo de execução
}
