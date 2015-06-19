package VerbaAprovacaoBanco;

public class Vp extends Cargo {

	public Vp(String nomeFunc) {
		super(nomeFunc);
	}

	@Override
	public void aprovar(Verba v) {
		if(v.getValor() <= 200000){
			System.out.println("Verba de " + v.getValor() + " aprovada por " + nomeFunc + " cargo: " + this ); 
		}else {
			suc.aprovar(v);
		}
	}

}
