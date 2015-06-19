package ListaT;

public class Lista<T> {
	private T elemento;
	private Lista<T> prox;
	
	public Lista (T elemento){
		this.elemento = elemento;
	}
	
	public void adicionar(T elemento){
		Lista<T> l = this;
		for(;l!=null;l=l.prox){
		    if (l.prox == null){
			   l.prox = new Lista<T>(elemento);
		       break;
		    } 
		}
	}
	
	public void percorrer(){
		Lista<T> l = this;
		for(;l!=null;l=l.prox){
			System.out.println(l.elemento);
		}
	}
}
