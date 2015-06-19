package revistafas;

public class Main {

	public static void main(String[] args) {
		FaWeb fa1 = new FaWeb();
		FaWeb fa2 = new FaWeb();
		
		RevistaCaras rev = new RevistaCaras();
		rev.attach(fa1);
		rev.attach(fa2);
		
		rev.setNoticia("Flávia é pega beijando um cavalo");
		
		
	}

}
