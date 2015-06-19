package PatoAdaptadoPeru;
/*
 * Exemplo: Sabe se que todo Pato voa e grasna. Todo Pato pode ser Negro ou Verde. 
 * Um Peru, que não é Pato emite som e não consegue voar.
 * Faça com que Peru e Pato trabalhem sob uma interface comum
 */
public class Main {

	public static void main(String[] args) {		
		Pato pato = new PatoVerde();
		pato.voar();
		pato.grasnar();

		PeruPatoAdapter peru = new PeruPatoAdapter();
		peru.voar();
		peru.grasnar();
		/*
		 * Voou como pato verde
			Grasnou como pato verde
			Bateu asass
			Glu Glu
		 */
	}
}
