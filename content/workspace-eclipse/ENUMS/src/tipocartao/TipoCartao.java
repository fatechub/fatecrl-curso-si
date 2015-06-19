package tipocartao;

import java.util.HashMap;

public enum TipoCartao {
	GOLD {
		@Override
		public double anuidade(){
			return 0.9;
		}
	}, 
	SILVER{
		@Override
		public double anuidade(){
			return 0.8;
		}
	}, 
	PLATIUM{
		@Override
		public double anuidade(){
			return 0.7;
		}
	}, 
	BLACK{
		@Override
		public double anuidade(){
			return 0.5;
		}
	};
	
	abstract public double anuidade();
	
	/*
	 *  HASHMAP - Not Working
	 */
	private HashMap<Integer,TipoCartao> hm;	
	//abstract public double anuidade();
	
	public void mapper(){
		hm = new HashMap<Integer,TipoCartao>();
		for(TipoCartao t : TipoCartao.values()){
			//PODERA TROCAR O ORDINAL
			hm.put(t.ordinal(), t);
		}
	}
	
	public TipoCartao getEnum(Integer i){
		return hm.get(i);
	}
	
}
