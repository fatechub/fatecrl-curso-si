package ex2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) {
		Class<? extends Cliente> clazz = new Cliente("Flavia", "Souza").getClass();
		
		System.out.println("-- ATRS --");
		Field[] f = clazz.getDeclaredFields();		
		for(Field g : f){
			System.out.println("nome = " + g.getName());  
	        System.out.println("membro da classe = " + g.getDeclaringClass());  
	        System.out.println("modificador = " + Modifier.toString( g.getModifiers() ) + "\n"); 
		}
		
		System.out.println("-- METH --");
		Method[] m = clazz.getDeclaredMethods();
		for(Method n : m){
			System.out.println("nome = " + n.getName());  
	        System.out.println("membro da classe = " + n.getDeclaringClass());  
	        System.out.println("modificador = " + Modifier.toString( n.getModifiers()  ) + "\n"); 
		}
		
		/* console
			-- ATRS --
			nome = nome / membro da classe = class ex2.Cliente / modificador = private
		    -- METH --
		    nome = mostrarNome / membro da classe = class ex2.Cliente / modificador = public
			nome = getNome / membro da classe = class ex2.Cliente / modificador = public
		 */		
	}
}
