package PortaJoias;

import java.util.ArrayList;

public class PortaJoia {
	private ArrayList<Joia> joias;
	
	public PortaJoia(){
		joias = new ArrayList<Joia>();
	}
	
	public void guardar(Joia h){
		joias.add(h);
	}
	
	public void verificarTodas(){
		for(Joia j : joias){
			if(j != null)
				System.out.println(j);
		}
	}
}
