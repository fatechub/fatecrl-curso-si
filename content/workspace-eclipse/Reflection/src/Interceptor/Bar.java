package Interceptor;

public class Bar {
	
	@Interceptor( met = "fazAlgo", cl = Foo.class )
	public void hello(){
		System.out.println("Bem-vindo");
	}
}
