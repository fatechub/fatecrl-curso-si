package empresapublicacargos;

public class Secretario extends Incorporados{
	public Secretario(double salario) {
		super(salario);
	}

	public Secretario() {
	}

	@Override
	public double calcSalario() {
		return 2000+prox.calcSalario();
	}

	@Override
	public String mostrarNome() {
		return prox.mostrarNome() + " incorporado como Secretario";
	}

}
