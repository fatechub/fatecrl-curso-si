package pacotesviagem;

public class ServicoBebidas extends PacoteDecorator {
	public ServicoBebidas(Pacote pacote) {
		super(pacote, "Bebidas", 10.0);
	}	
}
