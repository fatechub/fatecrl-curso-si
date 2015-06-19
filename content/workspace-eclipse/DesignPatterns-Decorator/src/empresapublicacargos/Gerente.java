package empresapublicacargos;

public class Gerente extends Cargo{
	public Gerente(double salario) {
		super(salario);
	}

	@Override
	public double calcSalario() {
		return 3000+salario;
	}

	@Override
	public String mostrarNome() {
		return "Gerente";
	}

}
