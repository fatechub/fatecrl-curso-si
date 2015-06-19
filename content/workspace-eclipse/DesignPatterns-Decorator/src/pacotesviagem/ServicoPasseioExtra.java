package pacotesviagem;

public class ServicoPasseioExtra extends PacoteDecorator {
	public ServicoPasseioExtra(Pacote pacote) {
		super(pacote, "Passeio Extra", 150.0);
	}	
}