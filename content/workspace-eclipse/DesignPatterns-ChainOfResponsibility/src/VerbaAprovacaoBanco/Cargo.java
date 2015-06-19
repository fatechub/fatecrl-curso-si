package VerbaAprovacaoBanco;

// HANDLER
abstract public class Cargo {
	
	protected Cargo suc;	
	protected String nomeFunc;	
	
	public Cargo(String nomeFunc){
		this.nomeFunc = nomeFunc;
	}
	
	public void setSuc(Cargo suc){
		this.suc = suc;
	}
	
	abstract public void aprovar(Verba v); // Polimorfismo
	
	// o this que esta dentro do syso mostra o esta aqui
	public String toString(){
		return this.getClass().getSimpleName();
	}
}
