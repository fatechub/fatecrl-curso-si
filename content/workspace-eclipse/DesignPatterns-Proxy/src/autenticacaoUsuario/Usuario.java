package autenticacaoUsuario;

// TIP: Quando esta na interface, tudo é "public" e "abstract"
// JAVA8 "default" desfaz o "abstract"
public interface Usuario { // antigo UsuarioControle
	// DEPENDE DA AUTENTICACAO
	void login();
	void telaPrincipal();
	void postar();
}
