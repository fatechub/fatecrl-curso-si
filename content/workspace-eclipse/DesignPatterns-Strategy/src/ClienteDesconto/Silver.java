package ClienteDesconto;

public class Silver implements TipoCliente{

	@Override
	public double descontar() {
		return 0.30;
	}

}
