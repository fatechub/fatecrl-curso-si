package naipe;

public class Main {

	public static void main(String[] args) {
		Naipe n = Naipe.PAUS;
		// Ordinal (Posicao vetor, inicia em 0)
		System.out.println( n + " " + n.ordinal() );
		
		// Valor em Ingles (Atributo)
		System.out.println( n + " " + n.valorIngles );
		
		// Poder (Atributo)
		System.out.println( n + " " + n.poder );
		
		// Mostrar Cor (metodo)
		n.mostrarCor();
		
		switch(n){
			case PAUS: System.out.println("Naipe de Paus"); break;
			case OUROS: System.out.println("Naipe de Ouros"); break;
			case COPAS: System.out.println("Naipe de Copas"); break;
			case ESPADAS: System.out.println("Naipe de Espadas"); break;
			default: System.out.println("Nenhum Naipe");break;
		}		
		/*
		 * Console:
			PAUS 0
			PAUS CLUBS
			PAUS 300
			VERMELLHO
			Naipe de Paus
		 */
		
		/* Pega naipe pela POSICAO */
		Naipe n2 = Naipe.values()[3];
		System.out.println(n2);
		// console: COPAS
		
		/* Pega Naipe (por poder) via HASHMAP - Working */
		Naipe n3 = Naipe.PAUS;
		n3.mapper(); 
		System.out.println( n3.getEnumByPoder(150) );
		// console: COPAS
	}	

}
