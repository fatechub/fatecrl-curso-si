/*
 * Em uma empresa públca, um cargo possui um nome e um valor de salário. 
 * Os cargos de ingresso são auxiliar, especialista, e gerente. 
 * Se alguém com um cargo entrar para um cargo político (Secretário, Prefeito ou Vereador) 
 * o salário deve ser incorporado. Um cargo pode ter mais de uma incorporação, os sálarios
 * base são calculados como se segue:
 * - Auxiliar = Inicial + 1000
 * - Especialista = Inicial + 2500
 * - Gerente = Inicial + 3000
 * e as incorporações:
 * - Prefeito = Base + 4000
 * - Secretário = Base + 2000
 * - Vereador = Base + 5000
 * Para o cargo: Se alguém entra como especialista e incorpora vereador e prefeito o cargo fica: 
 * especialista incorporado como prefeito incorporado como vereador.
 */
package empresapublicacargos;

public class Main {

	public static void main(String[] args) {

		Especialista flaviaEspecialista = new Especialista(800.0);		
			System.out.println( flaviaEspecialista.mostrarNome() + " R$ " + flaviaEspecialista.calcSalario() );
		
		Incorporados flaviaVereadora = new Vereador(1700.0);
		flaviaVereadora.setProx(flaviaEspecialista);	
			System.out.println( flaviaVereadora.mostrarNome() + " R$ " + flaviaVereadora.calcSalario() );
		
		Incorporados flaviaPrefeita = new Vereador(2300.0);
		flaviaPrefeita.setProx(flaviaVereadora);	
				System.out.println( flaviaPrefeita.mostrarNome() + " R$ " + flaviaPrefeita.calcSalario() );
		
		/* console
		   Especialista R$ 3300.0
		   Especialista incorporado como Vereador R$ 8300.0
		   Especialista incorporado como Vereador incorporado como Vereador R$ 13300.0
		 */
	}

}
