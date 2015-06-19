package ClienteDesconto;

public class Main {

	public static void main(String[] args) {
		
		Cliente ramon = new Cliente( "Ramon", null ); 
		System.out.println( "Desconto de Ramon é de: " + ramon.desconto() ); 
	}

}
