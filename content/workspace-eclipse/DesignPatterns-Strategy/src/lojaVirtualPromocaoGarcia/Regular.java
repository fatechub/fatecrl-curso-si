package lojaVirtualPromocaoGarcia;

public class Regular implements Promocao{
	
	private double extra;
	
	public Regular(double extra){
		if(extra <= 0.9 && extra >= 0.95)
			this.extra = extra;
		else
			this.extra = 1.;
	}
	
	public double descontar() {
		return 0.9*extra;
	}
	
}
