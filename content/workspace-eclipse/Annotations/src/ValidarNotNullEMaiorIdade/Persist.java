package ValidarNotNullEMaiorIdade;

public class Persist {
	public void salvar(Cliente c) throws Exception{
		if(Validator.isValid(c)){
			System.out.println("Salvo no BD...");
			System.out.println("NOME " + c.getNome());
			System.out.println("SOBRENOME " + c.getSobreNome());
			System.out.println("EMAIL " + c.getEmail());
			System.out.println("IDADE " + c.getIdade());
		}else{
			throw new Exception("Cliente nao validado!!!. Inclusao" + " Rejeitada");
		}
	}
}
