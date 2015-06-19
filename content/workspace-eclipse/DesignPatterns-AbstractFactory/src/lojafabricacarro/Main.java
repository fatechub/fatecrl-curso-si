package lojafabricacarro;

public class Main {

	public static CarroFabrica getFabrica(int fab){
		if(fab == 1){
			return new Citroen();
		}
		if(fab == 2){
			return new Honda();
		}
		return null;
	}
	
	public static Cor getCor(int cdCor){
		if(cdCor == 1){
			return new Preto();
		}
		if(cdCor == 2){
			return new Prata();
		}
		return null;
	}
	
	public static void main(String[] args) {
		CarroFabrica cf = Main.getFabrica(2);
		Sedan s = cf.criarSedan(1, "Honda City", 40000, Main.getCor(1));
		System.out.println(s);
		/*
		 * console:
		 *  Carro criado pela Honda
			Pintou de preto
			id = 1 nome = Honda City preco = 40000.0 cor = Preto tipo = Sedan

		 */

	}

}