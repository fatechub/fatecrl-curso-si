package lojafabricacarroversaoadam;

@CorAnnotation( codigo = 1 )
public class Preto implements Cor{

	@Override
	public void pintar() {
		System.out.println("Pintou de preto");
	}

}
