package PortaJoias;

//Boilerplate
class Anel extends Joia{}
class Pulseira extends Joia{}
class Colar extends Joia{}
class Brinco extends Joia{}

public class Joia {
	private double valor;
	
	public double getValor(){
		return valor;
	}
	
	public String toString(){
		Class<?> clazz = this.getClass();
		return clazz.getSimpleName();
	}
}
