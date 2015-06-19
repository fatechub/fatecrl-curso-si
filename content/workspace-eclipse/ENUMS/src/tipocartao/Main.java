/*
	 * crie a ENUM TipoCartao que possua as constantes
	 * GOLD, SILVER, PLATIUM e BLACK
	 * cada constante pode determinar um desconto na anuidade que é de 
	 * 10% GOLD, 20 SILVER, 30 PLAT, 50 BLACK
	 */

package tipocartao;

public class Main {

	public static void main(String[] args) {
		
		Cliente flavia = new Cliente(1, "Flávia", 100.0, TipoCartao.BLACK);
		System.out.println( flavia.toString() );
		// Console: Cliente [id=1, nome=Flávia, anuidade=100.0, tipoCartao=BLACK, calcularDesconto()=50.0]
		
		/* Pega cartao pela CONSTANTE */
		TipoCartao c = TipoCartao.GOLD;
		System.out.println( c.anuidade() );
		// console: 0.9
		
		/* Pega cartao pela POSICAO */
		TipoCartao c1 = TipoCartao.values()[3];
		System.out.println(c1);
		// console: BLACK
		
		/* Pega cartao via HASHMAP - Not Working */
		TipoCartao c2 = TipoCartao.GOLD;
		c2.mapper(); 
		System.out.println( c2.getEnum(3) );
		// console: BLACK
		
	}

}
