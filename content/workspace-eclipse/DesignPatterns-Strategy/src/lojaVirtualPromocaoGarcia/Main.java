/*
 * Uma loja virtual prossue alguns produtos a venda. Os produtos são livros, DVDs e brinquedos. 
 * Cada produto possui nome e preço. A mesma loja oferece promoções diferentes a cada mês. 
 * Uma promoção reguçar desconta cada produto em 10% mais um desconto extra varia de 5% a 10% dependendo do mês. 
 * Uma liquidação desnconta 30% ao preço de cada produto. Há meses quenão há promoção descrita.
 * Esta situação: 
 * - A) Desenhe o diagrama de classes;
 * - B) Codifique com base em A).
 */
package lojaVirtualPromocaoGarcia;

public class Main {

	public static void main(String[] args) {
		Brinquedo brinquedoCarro = new Brinquedo("Carro HotWells", 100);
		brinquedoCarro.setPromocao( new Regular(0.95) );
		System.out.println( "BRINQUEDO (regular): " + brinquedoCarro.calcularPreco() );
		// console: BRINQUEDO (regular): 90.0
		
		Livro livroHP = new Livro("Box Harry Potter", 500);
		livroHP.setPromocao( new Liquidacao() );
		System.out.println( "LIVRO (liquidacao): " + livroHP.calcularPreco());
		// console: LIVRO (liquidacao): 350.0
	}

}
