package lojafabricacarroversaoadam;
 
public class CarroFabrica {	
	protected static int totalCarrosCitroen;
    protected static int totalCarrosHonda;
    public static CarroFabrica instancia;
    
    protected CarroFabrica() {}
    
    // getInstancia
    public static CarroFabrica getFabrica(Class<? extends CarroFabrica> fabrica) throws InstantiationException, IllegalAccessException {       
    	if(fabrica!=null) {			
    		instancia = (CarroFabrica) fabrica.newInstance(); 
        }
		return instancia;
    }
    
	public Sedan criarSedan(int id, String nome, double valor, Cor c){ return null; };	
	public Luxo criarLuxo(int id, String nome, double valor, Cor c){ return null; };	
	
	
	//JAVA 8 (C:\Program Files\Java\jre1.8.0_45)
	public void mostrarFabricante(){
		System.out.println(this.getClass().getSimpleName() + " fabricou este carro");
	}
	
	public static String gerarRelatorio() {
        return new String("Total de carros CITROEN fabricados: " + totalCarrosCitroen
                + "\nTotal de carros HONDA fabricados: " + totalCarrosHonda);
    }
	
}