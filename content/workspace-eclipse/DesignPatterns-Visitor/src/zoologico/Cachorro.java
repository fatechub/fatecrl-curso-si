package zoologico;

final public class Cachorro extends Animal{ //final é pra nenhuma classe estender essa
	public Cachorro(String nome) {
		super(nome);
	}
	
	public void emitirSom(){
		System.out.println("AU AU");
	}

	public void accept(VisitorZoo z) {
		z.visitante(this);		
	}
}

