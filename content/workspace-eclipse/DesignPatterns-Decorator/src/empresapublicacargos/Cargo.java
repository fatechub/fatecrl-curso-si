package empresapublicacargos;

abstract public class Cargo {
	protected double salario;

	public Cargo(double salario) {
		this.salario = salario;
	}
	
	public Cargo(){}
	
	abstract public double calcSalario();
	
	abstract public String mostrarNome();
	
}
