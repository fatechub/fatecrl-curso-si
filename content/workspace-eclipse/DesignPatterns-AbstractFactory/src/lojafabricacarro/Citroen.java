package lojafabricacarro;

public class Citroen implements CarroFabrica{

	@Override
	public Sedan criarSedan(int id, String nome, double valor, Cor c) {
		mostrarFabricante();
		c.pintar();
		return new Sedan(id, nome, valor, c);
	}

	@Override
	public Luxo criarLuxo(int id, String nome, double valor, Cor c) {
		mostrarFabricante();
		c.pintar();
		return new Luxo(id, nome, valor, c);
	}

}
