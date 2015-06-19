package ordem;

public class Gato {
	String raca;
	
	public Gato(){
		raca = "Branco";
	}
	
	@Ordem(numero = 1) public void Acordar(){
		System.out.println("Acordou...");
	}
	
	@Ordem(numero = 3) public void Dormir(){
		System.out.println("Dormiu...");
	}
	
	@Ordem(numero = 2) public void Miar(){
		System.out.println("Miou...");
	}
}
