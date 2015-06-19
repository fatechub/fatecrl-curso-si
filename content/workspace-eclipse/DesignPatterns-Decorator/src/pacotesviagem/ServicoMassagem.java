package pacotesviagem;

public class ServicoMassagem extends PacoteDecorator {
	public ServicoMassagem(Pacote pacote) {
		super(pacote, "Serviço de Massagem", 50.0);
	}
}