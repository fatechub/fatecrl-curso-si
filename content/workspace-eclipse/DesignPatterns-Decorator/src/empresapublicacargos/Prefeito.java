package empresapublicacargos;

public class Prefeito extends Incorporados{

	public Prefeito(double salario) {
		super(salario);
	}

	public Prefeito(){}
	
	@Override
	public double calcSalario() {
		return 4000+prox.calcSalario();
	}

	@Override
	public String mostrarNome() {
		return prox.mostrarNome() + " incorporado como Prefeito";
	}

}
