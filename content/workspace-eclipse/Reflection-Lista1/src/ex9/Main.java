package ex9;

import java.lang.reflect.Field;

public class Main {
	
	public static String trocar(String sql){
		char[] ch = sql.toCharArray();
		ch[ch.length-1] = 0;
		return new String(ch);
	}
	
	public static void doSQL(Object o){
		Class<?> clazz = o.getClass();
		Field[] fs = clazz.getDeclaredFields();
		String sql = "SELECT ";
		for(Field f : fs){
			sql += f.getName() + ",";
		}
		sql = trocar(sql);
		sql += "FROM " + clazz.getSimpleName() + " WHERE " + fs[0].getName() + " = ?";
		System.out.println(sql);
	}

	public static void main(String[] args) throws Exception {
		Cliente c1 = new Cliente();	
		doSQL(c1);
		// console:SELECT nome,nome2,nome3,nome4,nome5 FROM Cliente WHERE nome = ?
	}

}
