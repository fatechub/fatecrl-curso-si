package BancoAprova;

abstract public class Banco {
	
	protected int codigo;
	protected Banco sucbanco;	

	public Banco(int c) {
		this.codigo = c;
	}
	
	public void setSuccessor(Banco b){
		this.sucbanco = b;
	}
	
	public void aprovar(int numero){
		if ( this.codigo == numero )
			System.out.println("Aprovado BancoA");
	}
}
