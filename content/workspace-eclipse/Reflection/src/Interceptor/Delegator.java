package Interceptor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Delegator {
	public void voidExecutor(Object obj, String metodo) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException{
		Class<?> clazz = obj.getClass();
		Method metFind = clazz.getDeclaredMethod(metodo);
		if(metFind==null){
			System.out.println("ERRO: Metodo não existe!");		
		}else{
			//if(metFind.getName()==metodo){								
			if (metFind.isAnnotationPresent( Interceptor.class )) {
				Interceptor a = metFind.getAnnotation( Interceptor.class ); 
				String met = a.met();
				Class cl = a.cl();										
				Object objx = cl.newInstance();
				Class<?> clazzx = objx.getClass();					
				Method[] msx = clazzx.getDeclaredMethods();
				for(Method mx : msx){
					if( mx.getName().equals(met) ){
						mx.setAccessible(true);
						mx.invoke(objx, null);
					}							
				}					
			}
			metFind.invoke(obj, null); // Bem-vindo
			//}	
		}	
	}
}
