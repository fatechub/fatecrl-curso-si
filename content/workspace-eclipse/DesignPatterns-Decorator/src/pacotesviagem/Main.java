package pacotesviagem;

public class Main {

	public static void main(String[] args) {

		System.out.println("== PACOTE PRAIA (SANTOS-$500): INCLUI BEBIDA ($10) + MASSAGEM ($50)");
		Pacote pacotePraia =  
				new ServicoMassagem( new ServicoBebidas( new PacotePraia("Santos", 500.0) ) );

		System.out.println("DESCRIÇÃO " + pacotePraia.getDesc());
		System.out.println("TOTAL R$ " + pacotePraia.getPreco());

		/*
		 * console: 
		 *	== PACOTE PRAIA (SANTOS-$500): INCLUI BEBIDA ($10) + MASSAGEM ($50)
		 *	DESCRIÇÃO Pacote para praia: Santos + Bebidas + Serviço de Massagem
		 *	TOTAL R$ 560.0
		 */
	}

}
