package VerbaAprovacaoBanco;
public class Ceo extends Cargo {
	
	public Ceo(String nomeFunc){
		super(nomeFunc);
	}

	@Override
	public void aprovar(Verba v) {
		System.out.println("Verba de " + v.getValor() + " aprovada por " + nomeFunc + " cargo: " + this );
	}

}
