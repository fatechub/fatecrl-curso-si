package linguagemToy;

public class TocarSom extends CommandsDecorator {
	
	public TocarSom(Toy comando) {
		super(comando); 
		System.out.println("Tocando som...");
	}
	
	// push System.out.println("Tocando som...")

}
