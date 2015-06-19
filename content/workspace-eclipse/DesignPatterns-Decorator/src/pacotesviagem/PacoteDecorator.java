package pacotesviagem;

public abstract class PacoteDecorator extends Pacote {
	protected Pacote pacote;

	public PacoteDecorator(Pacote pacote, String descServ, Double precoServ) {
		super(pacote.getDesc() + " + " + descServ, pacote.getPreco() + precoServ);
		this.pacote = pacote;
	}

}
