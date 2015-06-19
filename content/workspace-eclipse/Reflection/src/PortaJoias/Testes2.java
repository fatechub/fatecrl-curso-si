package PortaJoias;

import java.util.*;

public class Testes2 {
    //Lower Bound
	public static void main(String[] args) {
		//List<? super Number> a = new ArrayList<Object>();
		//a.add(3.4);
		//Integer w = (Integer)a.get(0);
		//System.out.println(w);
		ArrayList<Integer> o = new ArrayList<Integer>();
		o.add(7);
		List<? extends Number> b = o;
		Integer k = (Integer)b.get(0);
		System.out.println(k);
		//PECS
	}

}
