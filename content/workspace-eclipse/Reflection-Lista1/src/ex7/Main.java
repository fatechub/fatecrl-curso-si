package ex7;

import java.lang.reflect.Field;

public class Main {
	
	public static void isValid(Object o) throws Exception{
		Class<?> clazz = o.getClass();
		Field[] fs = clazz.getDeclaredFields();
		for(Field f : fs){			
			if(f.isAnnotationPresent(Senha.class)){
				f.setAccessible(true);
				String senha = (String) f.get(o);
				if( !senha.matches(".*\\d+.*") )
					throw new Exception("ERRO! Senha tem que ter numero");
			}
		}
		System.out.println("OK!");		
	}

	public static void main(String[] args) throws Exception {
		Cliente c1 = new Cliente("Flavia", "a3b");		
		isValid(c1); // OK
		System.out.println( c1.toString() );
		
		Cliente c2 = new Cliente("Ramon", "aa");		
		isValid(c2); // ERRO
		System.out.println( c2.toString() );
	}

}
