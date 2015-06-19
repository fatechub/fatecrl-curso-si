package tipocarros;

public enum TipoCarro {
	LUXO(10), SEDAN(5), HATCH(7);
	
	TipoCarro(int importancia){
		this.importancia = importancia;
	}
	
	public int importancia;
	
	// pode fazer atributo privado e  GETS e SETS
}
