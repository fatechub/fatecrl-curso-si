package autenticacaoUsuario;


public class UsuarioVisitante implements Usuario {

	UsuarioVisitante(){}
	
	@Override
	public void login(){
		System.out.println("Erro ao autenticar");
	}
	
	@Override
	public void telaPrincipal(){
		System.out.println("Mostrando tela principal como visitante");
	}
	
	@Override
	public void postar(){
		System.out.println("Visitante não pode publicar post");
	}

}
