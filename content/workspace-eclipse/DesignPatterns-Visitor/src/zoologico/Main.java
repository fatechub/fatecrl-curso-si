package zoologico;

public class Main {
	public static void main(String[] args) {
		Cachorro cao = new Cachorro("ScoobyDoo");
		Gato gato = new Gato("Garfield");
		VisitorZoo zooA = new VisitorZooA();
		VisitorZoo zooB = new VisitorZooB();
		ObjectStructure o = new ObjectStructure();

		Animal animal = new Cachorro("BradPittyJR");
		// animal.accept(zooA);
		// animal.emitirSom();
		o.adicionar(cao);
		o.adicionar(gato);
		o.adicionar(animal);
		o.acceptAll(zooA);
		o.acceptAll(zooB);
	}
	// quem decide o dispacho do metodo щ o tipo do this
	// SINGLE DISPATCH: NO JAVA O DESPACHO (chamada)
	// de um metodo щ decidido em tempo de execuчуo
	// APENAS pelo tipo da variavel this (chamador).
	/*
	 * console: 
	 * Щ um cachorro no ZooA \n Щ um gato no ZooA \n Щ um cachorro no ZooA Щ
	 * um cachorro no ZooB \n Щ um gato no ZooB \n Щ um cachorro no ZooB
	 */
}
