package ex4;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) {
		Class<? extends Animal> clazz = new Animal().getClass();
				
		System.out.println("-- METHS com modifers (protected static) --");
		Method[] m = clazz.getDeclaredMethods();
		for(Method n : m){
			if (  (Modifier.isStatic(n.getModifiers())) && (Modifier.isProtected(n.getModifiers())) )
				System.out.println("nome do metodo = " + n.getName());
		}
		
		/* console
			-- METHS com modifers (protected static) --
			nome do metodo = fooProtegidoStatico
			nome do metodo = fooProtegidoStatico2
		 */		
	}
}
