package createSelectAnnotationFora;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import Interceptor.Interceptor;

public class Main {
	
	public static void createSelect(Object obj) {
		String sql = "SELECT ";
		Class<?> clazz = obj.getClass();
		Field[] fs = clazz.getDeclaredFields();
		for(Field f : fs){
			if (!f.isAnnotationPresent( Fora.class )) {
			   sql +=  f.getName() + ", ";
			}							
		}
		// sql = trocar(sql);
		sql += "FROM " + clazz.getSimpleName();
		System.out.println(sql);		
	}

	public static void main(String[] args) {
		createSelect( new Cliente() );
	}

}
