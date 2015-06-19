package ex8;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class Main {
	
	public static void setAllIntengerFor89Negative(Object o) throws IllegalArgumentException, IllegalAccessException{
		Class<?> clazz = o.getClass();
		Field[] fs = clazz.getDeclaredFields();
		for(Field f : fs){
			f.setAccessible(true);	    
		    if(f.getType().equals(int.class)){
		    	f.set(o, -89);		    	
		    };
		}		
	}

	public static void main(String[] args) throws Exception {
		Cliente c1 = new Cliente("Flavia", 20);	
		System.out.println( c1.toString() );
		setAllIntengerFor89Negative(c1);
		System.out.println( c1.toString() );
	}

}
