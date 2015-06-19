package BancoAprova;

public class BancoB extends Banco {

	public BancoB(int c) {
		super(c); 
	}
	
	public void aprovar(int numero){
		if ( this.codigo == numero )
			System.out.println("Aprovado BancoB");
		else
			this.sucbanco.aprovar(numero);
	}

}
