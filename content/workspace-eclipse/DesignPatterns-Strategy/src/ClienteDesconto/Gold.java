package ClienteDesconto;

public class Gold implements TipoCliente{

	@Override
	public double descontar() {
		return 0.70;
	}
	
}
