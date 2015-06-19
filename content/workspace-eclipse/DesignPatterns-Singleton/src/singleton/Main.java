package singleton;

public class Main {
	
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		
		// sempre vai ser o mesmo endereco de memoria!
		Singleton s2 = Singleton.getInstance(); 
		
		// estudar: via threw - sinchronized

	}

}
