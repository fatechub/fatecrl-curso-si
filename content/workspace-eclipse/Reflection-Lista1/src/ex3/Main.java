package ex3;

public class Main {

	public static void main(String[] args) {
		Class<? extends Automovel> clazz = new Automovel().getClass();
		
		System.out.println("-- INTERFACES Automovel --");
		Class[] in = clazz.getInterfaces();		
		for(Class v : in){
			System.out.println("Interface = " + v.getName());   
		}	
		/* console
			-- INTERFACES Automovel --
			Interface = ex3.Carro
			Interface = ex3.Moto
		 */		
	}
}
