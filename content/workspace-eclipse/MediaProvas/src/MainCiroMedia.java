
public class MainCiroMedia {

	public MainCiroMedia() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		double A1, A2, A3, EX, PROJ, ME, MP, MF;
		
		/* NOTAS */
		A1 = 7.65;		 
		A2 = 7.05;
		A3 = 0;
		EX = 10;
		PROJ = 10;
		
		// Calcula Media Exercicios 
		ME = EX/1;
		System.out.println("ME (media exercicios)= " + ME);
		
		// Calcula Media Provas
		if (A3>0) {
			MP = (max(A1,A2)+2*A3)/3;
		} else { 
			MP = (A1+2*A2)/3;
		}		
		System.out.println("MP (media provas)= " + MP);
		
		// Calcula Media Final
		MF = (ME+(3*PROJ)+(6*MP))/10;		
		System.out.println("MF (media final)= " + MF);

	}

	private static double max(double a1, double a2) {
		if(a1>a2) 
			return a1;
		else 
			return a2;
	}

}
