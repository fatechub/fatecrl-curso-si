package naipe;

import java.util.HashMap;

public enum Naipe {
	
	PAUS("CLUBS",300){ @Override public void mostrarCor(){ System.out.println("VERMELLHO"); } }, 
	OUROS("DIAMONDS",100){ @Override public void mostrarCor(){ System.out.println("VERMELLHO"); } },
	ESPADAS("SPADES",250){ @Override public void mostrarCor(){ System.out.println("VERMELLHO"); } },
	COPAS("HEARTS",150){ @Override public void mostrarCor(){ System.out.println("VERMELLHO"); }	};
	
	Naipe(String valorIngles, int poder){
		this.valorIngles = valorIngles;
		this.poder = poder;
	}
	
	public String valorIngles;
	public int poder;
	abstract public void mostrarCor();
	
	/*
	 *  HASHMAP - Working
	 */
	private HashMap<Integer,Naipe> hm;	
	
	public void mapper(){
		hm = new HashMap<Integer,Naipe>();
		for(Naipe t : Naipe.values()){
			//hm.put(t.ordinal(), t); // pega por posicao
			hm.put(t.poder, t); // pega por poder
		}
	}
	
	public Naipe getEnumByPoder(Integer i){
		return hm.get(i);
	}
	
}
