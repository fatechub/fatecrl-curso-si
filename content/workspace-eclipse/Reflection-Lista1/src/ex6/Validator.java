package ex6;

import java.lang.reflect.Field;

public class Validator {
	public static boolean isValid(Object o) throws IllegalArgumentException, IllegalAccessException{
		Class<?> clazz = o.getClass();
		Field[] fs = clazz.getDeclaredFields();
		for(Field f : fs){			
			if(f.isAnnotationPresent(Positivo.class)){
				f.setAccessible(true);
				int numero = (int) f.get(o);
				if(numero < 0)
					return false;		
			}
		}
		return true;
	}
}
