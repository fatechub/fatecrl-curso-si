package zoologico;

import java.util.ArrayList;

public class ObjectStructure {
	private ArrayList<Animal> v;
	
	public ObjectStructure(){
		v = new ArrayList<Animal>();
	}
	
	public void adicionar (Animal a){
		v.add(a);
	}
	
	public void acceptAll(VisitorZoo z){
		for (Animal animal : v) {
			animal.accept(z);			
		}
	}
}
