package BancoAprova;

public class BancoC extends Banco {

	public BancoC(int c) {
		super(c);
	}
	
	public void aprovar(int numero){
		if ( this.codigo == numero )
			System.out.println("Aprovado BancC");
		else
			System.out.println("Ninguem Aprovou");
	}

}
