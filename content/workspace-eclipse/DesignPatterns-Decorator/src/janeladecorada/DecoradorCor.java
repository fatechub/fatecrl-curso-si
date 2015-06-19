package janeladecorada;

public class DecoradorCor extends JanelaDecorator {
	private String janelaCor;
	public DecoradorCor(Janela janelaDecorada, String janelaCor) {
		super(janelaDecorada);
		this.janelaCor = janelaCor;
	}
	@Override
	public void desenhar() {
		System.out.println("Adiciona a cor " + janelaCor);
		janelaDecorada.desenhar();
	}

}
