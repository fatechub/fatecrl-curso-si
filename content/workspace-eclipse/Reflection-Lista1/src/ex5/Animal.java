package ex5;

import java.util.AbstractList;

public class Animal<T> extends AbstractList<T> {
	
	public String AtrrPublico;
	public String AtrrPublico2;
	String AtrrDefault1;
	String AtrrDefault2;
	T AtrrPublioInstanciaT[];
	
	public static void fooPublicoStatico() {}
	public static void fooPublicoStatico2() {}
	public void fooProtegidoNaoStatico() {}
	protected static void fooProtegidoStatico() {}
	protected static void fooProtegidoStatico2() {}
	
	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	} 
	
	
}
