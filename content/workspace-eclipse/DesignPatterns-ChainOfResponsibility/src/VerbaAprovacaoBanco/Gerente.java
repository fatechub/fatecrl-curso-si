package VerbaAprovacaoBanco;
public class Gerente extends Cargo {
	
	public Gerente(String nomeFunc){
		super(nomeFunc);
	}

	@Override
	public void aprovar(Verba v) {
		if(v.getValor() <= 80000 && v instanceof Normal){
			// this foi usado por causa do toString do Cargo
			System.out.println("Verba de " + v.getValor() + " aprovada por " + nomeFunc + " cargo: " + this ); 
		}else {
			suc.aprovar(v);
		}
	}

}
