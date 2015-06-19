/*
 * Exemplo JanelaDecorator baseado no artigo Padrão de Projeto Decorator em Java por devmedia
 * http://www.devmedia.com.br/padrao-de-projeto-decorator-em-java/26238
 * FOTO UML JANELA: https://cloud.githubusercontent.com/assets/1139893/7107806/8275eaa4-e147-11e4-8945-e1614de77121.png
 * FOTO UML DECORATOR: https://cloud.githubusercontent.com/assets/1139893/7107805/8275a350-e147-11e4-9fb8-c0d9bec920d0.png
 */
package janeladecorada;

public class Main {
	public static void main(String[] args) { 
		System.out.println("== JANELA APTO: DECORA COM MOLDURA");
		Janela janelaAptoDecorada = new DecoradorMoldura(new JanelaApartamento());
		janelaAptoDecorada.desenhar();
		System.out.println("== JANELA CASA: DECORA COM MOLDURA + DECORA COM COR");
		Janela janelaCasaDecorada = new DecoradorCor(new DecoradorMoldura(new JanelaCasa()), "Rosa");
		janelaCasaDecorada.desenhar();
	}
	/* console:
	 *  == JANELA APTO: DECORA COM MOLDURA
		 Moldurando a janela...
		 Desenha Janela Apartamento
		== JANELA CASA: DECORA COM MOLDURA + DECORA COM COR
		 Adiciona a cor Rosa
		 Moldurando a janela...
		 Desenha Janela Casa
	 */
}
