package empresapublicacargos;

final public class Auxiliar extends Cargo{

	public Auxiliar(double salario) {
		super(salario);
	}

	@Override
	public double calcSalario() {
		return 1000+salario;
	}

	@Override
	public String mostrarNome() {
		return "Auxiliar";
	}

}
