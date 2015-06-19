package ClienteDesconto;

public class Cliente {
	private String nome;
	private TipoCliente tipo; 

	public Cliente(String nome, TipoCliente tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public double desconto(){
		if(tipo==null) 
			return 0.1;
		else
			return tipo.descontar();
	} 
	
}
