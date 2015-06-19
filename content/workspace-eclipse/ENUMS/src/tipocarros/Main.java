
	/*
	 * Faça a ENUM tipoCarro que possua os tipos "luxo", "sedan", "hatch"
	 * Crie uma constante inteira "importancia" que numere luxo com 10, sedan com 5 e hatch com 7
	 * faca o teste
	 */

package tipocarros;

public class Main {

	public static void main(String[] args) {
		TipoCarro car = TipoCarro.SEDAN;
		System.out.println( "TIPO: " + car + " - importancia: " + car.importancia );
		
		TipoCarro car2 = TipoCarro.LUXO;
		System.out.println( "TIPO: " + car2 + " - importancia: " + car2.importancia );
		
		TipoCarro car3 = TipoCarro.HATCH;
		System.out.println( "TIPO: " + car3 + " - importancia: " + car3.importancia );
		/*
		 * console:
			TIPO: SEDAN - importancia: 5
			TIPO: LUXO - importancia: 10
			TIPO: HATCH - importancia: 7
		 */
	}
	
}
