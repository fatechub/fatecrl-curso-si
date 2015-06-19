package ListaT;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Lista<Integer> l = new Lista<Integer>(3);
		l.adicionar(2);
		l.adicionar(4);
		l.percorrer();
		
		Lista<String> w = new Lista<String>("Ola");
		w.adicionar("Mundo");
		w.percorrer();
		
		ArrayList<Integer>al = new ArrayList<Integer>();
		al.add(1);
		al.add(3);
		al.add(7);
		
		for(Integer a:al){
			System.out.println(a);
		}
	}
}
