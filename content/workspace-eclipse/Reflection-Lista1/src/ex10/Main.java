package ex10;

import java.lang.reflect.Field;

public class Main {
	
	public static void doThis(Object o){
		Class<?> clazz = o.getClass();
		Field[] fs = clazz.getDeclaredFields();
		int aux = 0;
		for(Field f : fs){			
			if(aux++==4) {
				String tipo = f.getType().getName();
				System.out.println(tipo);
			}
		}		
	}

	public static void main(String[] args) throws Exception {
		Cliente c1 = new Cliente();	
		doThis(c1);
	}

}
