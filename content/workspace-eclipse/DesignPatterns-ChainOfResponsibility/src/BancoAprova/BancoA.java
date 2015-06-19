package BancoAprova;

public class BancoA extends Banco {

	public BancoA(int c) {
		super(c);
	}
	
	public void aprovar(int numero){
		if ( this.codigo == numero )
			System.out.println("Aprovado BancoA");
		else
			sucbanco.aprovar(numero);
	}

}
