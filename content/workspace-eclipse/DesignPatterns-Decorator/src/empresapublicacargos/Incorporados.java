package empresapublicacargos;

abstract public class Incorporados extends Cargo{

	protected Cargo prox;
	
	public Incorporados(double salario) {
		super(salario);
	}
	
	public Incorporados(){}

	public void setProx(Cargo prox) {
		this.prox = prox;
	} 
	
	
}
