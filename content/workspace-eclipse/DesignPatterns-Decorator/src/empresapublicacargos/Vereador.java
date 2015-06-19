package empresapublicacargos;

public class Vereador extends Incorporados{

	public Vereador(double salario) {
		super(salario);
	}

	public Vereador(){}
	
	@Override
	public double calcSalario() {
		return 5000+prox.calcSalario();
	}

	@Override
	public String mostrarNome() {
		return prox.mostrarNome() + " incorporado como Vereador";
	}

}
