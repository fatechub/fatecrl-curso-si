package PatoAdaptadoPeru;

// É "implements" Porque Pato é uma Interface
public class PatoVerde implements Pato{

	@Override
	public void grasnar() {
		System.out.println("Grasnou como pato verde");
	}
	
	@Override
	public void voar() {
		System.out.println("Voou como pato verde");
		
	}

}
