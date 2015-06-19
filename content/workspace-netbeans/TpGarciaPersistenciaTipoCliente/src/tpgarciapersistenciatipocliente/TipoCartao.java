package tpgarciapersistenciatipocliente; 

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
	
}
