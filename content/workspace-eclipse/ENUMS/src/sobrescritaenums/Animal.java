package sobrescritaenums;

public enum Animal {
	
	DOG { 
		@Override
		public void emitirSom(){
			System.out.println("AUAUAUU");
		}
	},
	CAT { 
		@Override
		public void emitirSom(){
			System.out.println("MIAUUU");
		}
	};
	
	abstract public void emitirSom();
	
}
