package lojafabricacarroversaoadam;

public class Main {
	
	public static Cor getCor(int cdCor){		
		if(cdCor == 1){
			return new Preto();
		}
		if(cdCor == 2){
			return new Prata();
		}
		return null;
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Sedan car = CarroFabrica.getFabrica(Honda.class).criarSedan(1, "Honda City", 40000, Main.getCor(1));
		Sedan car2 = CarroFabrica.getFabrica(Honda.class).criarSedan(2, "Honda Civic", 40000, Main.getCor(2));
		Luxo car3 = CarroFabrica.getFabrica(Honda.class).criarLuxo(3, "Honda Civic Luxo 2", 40000, Main.getCor(2));
		
		Sedan car4 = CarroFabrica.getFabrica(Citroen.class).criarSedan(4, "Citroen C4", 30000, Main.getCor(2));
		Luxo car5 = CarroFabrica.getFabrica(Citroen.class).criarLuxo(4, "Citroen Luxo 2", 40000, Main.getCor(2));
		
		System.out.println( "\n\n========" );
		System.out.println(car);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car4);
		System.out.println(car5);
		
		System.out.println( "\n\n========" );
		System.out.println( CarroFabrica.gerarRelatorio() );
	}

}