package janeladecorada;
// DECORATOR
abstract class JanelaDecorator extends Janela {
	// Componente
	protected Janela janelaDecorada;
	// Esse é o "set" do "componente"
	public JanelaDecorator(Janela janelaDecorada) { 
		this.janelaDecorada = janelaDecorada; 
	}
}
