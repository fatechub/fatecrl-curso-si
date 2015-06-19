package PatoAdaptadoPeru;


public class PeruPatoAdapter extends Peru implements Pato{
	
	@Override
	public void grasnar() {
		wooble();
	}

	@Override
	public void voar() {
		baterAsas();
	}
}
