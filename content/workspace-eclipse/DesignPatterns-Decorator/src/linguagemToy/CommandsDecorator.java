package linguagemToy;

public abstract class CommandsDecorator extends Toy {
	protected Toy comando;

	public CommandsDecorator(Toy comando) {
		this.comando = comando;
	}

}
