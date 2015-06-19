package autenticacaoUsuario;


public class UsuarioProxy implements Usuario {
	private Usuario usuario;
	
	// Criar uma classe (MODEL)
	// "private Usuario user" e etc
	private String user, senha;
	
	public UsuarioProxy(String user, String senha) {
		this.user = user;
		this.senha = senha;
	}
	
	@Override
	public void login(){
		if(user.equals("root") && senha.equals("root")){
			usuario = new UsuarioReal();
		}else{
			usuario = new UsuarioVisitante();
		}
		usuario.login();
	}
	
	@Override
	public void telaPrincipal(){
		usuario.telaPrincipal();
	}
	
	@Override
	public void postar(){
		usuario.postar();
	}
}
