package revistafas;
import java.util.ArrayList;


public abstract class Revista {	
	private ArrayList<Fa> fas;
	private String noticia;
	
	public Revista() {
		fas = new ArrayList<Fa>();
	}
	
	public void attach(Fa f){
		fas.add(f);
	}
	
	public void notificar(){
		for(Fa f : fas){
			f.update(this);
		}
	}
	
	public abstract String getState();

}
