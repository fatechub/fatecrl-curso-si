package PortaJoias;

//Upper Bound
public class Caixa<T>{
	private T coisa;
	
	public void guardar(T coisa){
		this.coisa = coisa;
	}
	
	public void identificar(){
		System.out.println(coisa);
	}
	
	public T getCoisa(){
		return coisa;
	}
	
	public void algo(Caixa<? super Joia> var){
		System.out.println(var);
	}
}
