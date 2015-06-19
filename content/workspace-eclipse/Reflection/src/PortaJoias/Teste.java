package PortaJoias;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		PortaJoia p = new PortaJoia();
		Joia j = new Anel();
		p.guardar(new Colar());
		p.guardar(new Brinco());
		p.guardar(new Colar());
		p.guardar(new Colar());
		p.guardar(null);
		p.guardar(new Colar());
		p.guardar(new Anel());
		p.verificarTodas();
	}

}
