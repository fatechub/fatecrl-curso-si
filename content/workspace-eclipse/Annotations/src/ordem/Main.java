package ordem;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	
	static void ordenar(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Class<?> clazz = obj.getClass();
		Method[] m = clazz.getDeclaredMethods();
		Method[] aux = new Method[m.length];
		for(Method n : m){
			if(n.isAnnotationPresent(Ordem.class)){
				Ordem s = n.getAnnotation(Ordem.class);
				int numero = s.numero();
				aux[numero -1] = n ;				
			}
		}		
		for(Method n : m){
			if(n!=null)
				// Passa o objeto e parametros
				n.invoke(obj, null); 
		}
	}

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Gato branco = new Gato();
		ordenar(branco);
	}
	
}
