package autenticacaoMain;

import autenticacaoUsuario.UsuarioProxy;

public class Main {

	public static void main(String[] args) {
		// Não precisa importar linha abaixo, pq n da pra instanciar, só no msm
		// pacote
		// import autenticacaoUsuario.UsuarioReal;
		// ERRO PQ O COSNTRUTOR ESTA DEFAULT (Precisa estar no msm pacote)
		// UsuarioReal a = new UsuarioReal();

		System.out.println("\n\n== USUARIO VISITANTE");
		UsuarioProxy user1 = new UsuarioProxy("fatec", "123");
		user1.login();
		user1.telaPrincipal();
		user1.postar();

		System.out.println("\n\n== USUARIO ROOT");
		UsuarioProxy user2 = new UsuarioProxy("root", "root");
		user2.login();
		user2.telaPrincipal();
		user2.postar();
		/*
		 * == USUARIO VISITANTE Erro ao autenticar Mostrando tela principal como
		 * visitante Visitante não pode publicar post
		 * 
		 * == USUARIO ROOT Operacao feita por um usuario autenticado Mostrando
		 * tela principal Post publicado
		 */
	}

}
