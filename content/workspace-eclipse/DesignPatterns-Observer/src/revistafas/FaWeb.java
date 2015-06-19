package revistafas;
// CONCRETE OBSERVER
public class FaWeb implements Fa {

	public FaWeb() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Revista r) {
		System.out.println("Atalizacao na pagina web");
		System.out.println( r.getState() );		
	}
}
