package VerbaAprovacaoBanco;

public class Superintendente extends Cargo {

	public Superintendente(String nomeFunc) {
		super(nomeFunc);
	}

	@Override
	public void aprovar(Verba v) {
		if(v.getValor() <= 40000 && v instanceof Importante || v instanceof  Normal){
			System.out.println("Verba de " + v.getValor() + " aprovada por " + nomeFunc + " cargo: " + this ); 
		}else {
			suc.aprovar(v);
		}
	}

}
