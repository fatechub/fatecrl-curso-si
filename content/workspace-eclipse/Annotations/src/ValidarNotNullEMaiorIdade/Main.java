package ValidarNotNullEMaiorIdade;

public class Main {

	public static void main(String[] args) throws Exception {
		Cliente c = new Cliente("", "AKdakjdk", "iuu@diusi.com",11);
		Cliente d = new Cliente("Carlos", "dasdaakjdk", "ddiuu@diusi.com",18);
		Cliente e = new Cliente("Adam", null, "adam@adamm.me",55);
		Cliente f = new Cliente(null, "'", "",9);
		
		Persist p = new Persist();
		//p.salvar(c);
		//p.salvar(d);
		p.salvar(e);
		//p.salvar(f);
		
		// Produto prod = new Produto("IPHONE");
		// p.salvar(prod);
	}
}
