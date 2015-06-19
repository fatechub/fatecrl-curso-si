package autenticacaoUsuario;


public class UsuarioReal implements Usuario {

	// tem que ser default, e UsuarioProxy estar em outro pacote para bloquear a instancia
	UsuarioReal(){}
	
	@Override
	public void login(){
		System.out.println("Operacao feita por " + "um usuario autenticado");
	}
	
	@Override
	public void telaPrincipal(){
		System.out.println("Mostrando tela principal");
	}
	
	@Override
	public void postar(){
		System.out.println("Post publicado");
	}

}
