package linguagemToy;

public class Escreve extends CommandsDecorator {
	private String frase;
	
	public Escreve(Toy comando, String frase) {
		super(comando);
		this.frase = frase;
		System.out.println(this.frase);
	}
}
