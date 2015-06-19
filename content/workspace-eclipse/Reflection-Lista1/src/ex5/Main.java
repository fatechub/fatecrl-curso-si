package ex5;

import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.AbstractList;

import org.w3c.dom.Attr;

public class Main {

	public static void main(String[] args) {
		Class<? extends Animal> clazz = new Animal().getClass();
				
		System.out.println("-- METHS com modifers (protected static) --");
		Method[] m = clazz.getDeclaredMethods();
		for(Method n : m){
			if (  (Modifier.isProtected(n.getModifiers())) || (Modifier.isPublic(n.getModifiers())) )
				System.out.println("nome do metodo = " + n.getName());
		}
		
		System.out.println("-- ATTRS (default) --");
		Field[] f = clazz.getDeclaredFields();
		for(Field n2 : f){
			if (  !(Modifier.isPublic(n2.getModifiers())) && 
				  !(Modifier.isProtected(n2.getModifiers())) && 
				  !(Modifier.isPrivate(n2.getModifiers())) ) 
					System.out.println("nome do atributo = " + n2.getName() + " -- " + n2.getGenericType()); 				
		}
	}
}		
		/* console
			-- METHS com modifers (protected static) --
			nome do metodo = fooPublicoStatico
			nome do metodo = fooPublicoStatico2
			nome do metodo = fooProtegidoNaoStatico
			nome do metodo = fooProtegidoStatico2
			nome do metodo = fooProtegidoStatico
			-- ATTRS (default) --
			nome do atributo = AtrrDefault1
			nome do atributo = AtrrDefault2
			
			REF:
			http://bit.ly/1ynrtKZ
		 */	

