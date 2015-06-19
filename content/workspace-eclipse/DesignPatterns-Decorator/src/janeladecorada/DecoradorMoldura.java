package janeladecorada;

public class DecoradorMoldura extends JanelaDecorator {
	public DecoradorMoldura(Janela janelaDecorada) {
		super(janelaDecorada);
	}
	@Override
	public void desenhar() {
		moldurarJanela();
		janelaDecorada.desenhar();
	}
	public void moldurarJanela() {
		System.out.println("Moldurando a janela...");
	}
}
