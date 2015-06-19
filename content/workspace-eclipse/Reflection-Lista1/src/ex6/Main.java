package ex6;

public class Main {
	
	public static void salvar(Cliente c) throws Exception{
		if(Validator.isValid(c)){
			System.out.println("Salvo no BD...");
			System.out.println("NOME " + c.getNome() + "IDADE " + c.getIdade() );
		}else{
			throw new Exception("Cliente nao validado!!!. Inclusao" + " Rejeitada");
		}
	}

	public static void main(String[] args) throws Exception {
		Cliente pos = new Cliente("Positivo", 0);
		Cliente neg = new Cliente("Negativo", -1);
		
		salvar(pos);
		salvar(neg);
		/*
		 *  Salvo no BD...
			NOME PositivoIDADE 0
			...
			Exception in thread "main" java.lang.Exception: Cliente nao validado!!!. Inclusao Rejeitada
		 */
	}
}
