package PortaJoias;

public class Teste4 {

	public static void main(String[] args) {
		Caixa<? extends Joia> c = new Caixa<Colar>();
		Caixa<? super Joia> d = new Caixa<Object>();
		d.guardar(new Colar());
		Brinco b = (Brinco)d.getCoisa();
		System.out.println(b);
	}

}
