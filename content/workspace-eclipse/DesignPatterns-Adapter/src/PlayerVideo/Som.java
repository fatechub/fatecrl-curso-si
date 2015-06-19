package PlayerVideo;

abstract public class Som {

	public void rodarSom(){
		System.out.println("Rodando som... " + this.getClass().getSimpleName());
	}
	
	public void gravarSom(){
		System.out.println("Gravando som... " + this.getClass().getSimpleName());
	}

}
