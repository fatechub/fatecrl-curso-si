/*
 * DESIGN PATTERN CHAIN
 * Exemplo: Uma empresa trata aprovação de verbas. 
 * Uma verba pode ser Urgente ou normal. Toda verba possui um valor de investimento. 
 * O gerente aprova verbas normais ate 80000 unidades de valor e nao aprova verbas importantes. 
 * O superintendente aprova o valor. o VP aprova verbas verbas importantes de ate 200000 unidades.
 * O CEO aprova qualquer verba. Eh importante mostrar na tela: 
 * Verba de xxxx R$ aprovada por yyyy, cargo zzzzz.
 * Sendo xxxx o valor a ser aprovado, yyyyy o nome do funcionario e zzzz seu cargo
 */

package VerbaAprovacaoBanco;

public class Main {

	public static void main(String[] args) {
		Importante verbImpor = new Importante(50000);
		
		Gerente gerent = new Gerente("Ernesto");
		Superintendente superi = new Superintendente("Cadu");
		Vp vp = new Vp("Afonso");
		Ceo ceo = new Ceo("Luiz");
		
		gerent.setSuc(superi);
		superi.setSuc(vp);
		vp.setSuc(ceo);
		
		gerent.aprovar(verbImpor);
	}
}