package PortaJoias;

import java.lang.reflect.*;
import java.util.ArrayList;

public class TesteRef {
	
	public static void listarVal(Object a) throws IllegalArgumentException, IllegalAccessException{
		Class<?> clazz = a.getClass();
		System.out.println("----"+clazz.getSimpleName()+"----");
		Field[] f = clazz.getDeclaredFields();
		System.out.println("-- ATRS --");
		for(Field g : f){
			if(g.getModifiers()==2){
			    g.setAccessible(true);
			    System.out.println(g.getName()+" "+g.get(a));
			}
		}
		System.out.println("-- METH --");
		Method[] m = clazz.getDeclaredMethods();
		for(Method n : m){
			if(n.getModifiers()==2){
			   Type t = n.getGenericReturnType();
			   System.out.println(n.getName()+" "+t.toString());
			}	
		}
	}
	
	public static void listar(Object a){
		Class<?> clazz = a.getClass();
		System.out.println("----"+clazz.getSimpleName()+"----");
		Field[] f = clazz.getDeclaredFields();
		System.out.println("-- ATRS --");
		for(Field g : f){
			System.out.println(g.getName());
		}
		System.out.println("-- METH --");
		Method[] m = clazz.getDeclaredMethods();
		for(Method n : m){
			System.out.println(n.getName());
		}
	}
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		//TesteRef.listarVal(new Cachorro("SRD","PQ","DOG","PINK"));
		TesteRef.listarVal(new String("5"));
	}

}
