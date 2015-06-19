package BancoAprova;

public class Main {

	public static void main(String[] args) {
		BancoA b1 = new BancoA(1);
		BancoB b2 = new BancoB(2);
		BancoC b3 = new BancoC(3);
		
		b1.setSuccessor(b2);
		b2.setSuccessor(b3);
		
		b1.aprovar(5);	

	}

}
