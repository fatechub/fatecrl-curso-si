package lojafabricacarro;

public interface CarroFabrica {
	
	Sedan criarSedan(int id, String nome, double valor, Cor c);	
	Luxo criarLuxo(int id, String nome, double valor, Cor c);
	
	//JAVA 8 (C:\Program Files\Java\jre1.8.0_45)
	default void mostrarFabricante(){
		System.out.println(this.getClass().getSimpleName() + " fabricou este carro");
	}
	
}