package empresapublicacargos;

public class Especialista extends Cargo{
	public Especialista(double salario) {
		super(salario);
	}

	@Override
	public double calcSalario() {
		return 2500+salario;
	}

	@Override
	public String mostrarNome() {
		return "Especialista";
	}

}
