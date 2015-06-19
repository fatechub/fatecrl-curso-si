package GenericCreateTableDB;

import java.lang.reflect.Field;

public class GenericCreate {
	public static String create(Object o){
		String sql = "";
		sql = "CREATE TABLE ";
		Class<?> clazz = o.getClass();
		Table t = clazz.getAnnotation(Table.class);
		sql += t.nome() + "( ";
		
		Field[] fs = clazz.getDeclaredFields();
		for( Field f: fs){
			if(f.isAnnotationPresent(Column.class)){
				Column c = f.getAnnotation(Column.class);
				String nome = c.nome();
				sql +=  nome;
			}
			if(f.isAnnotationPresent(Varchar.class)){
				Varchar vc = f.getAnnotation(Varchar.class);
				int qt = vc.qut();
				sql += " vachar("+String.valueOf(qt)+"),";
			}else{
				String tipo = f.getType().getName();
				sql += " " + tipo + ",";
			}			
		}
		sql = trocar(sql);
		return sql;
	}
	
	public static String trocar(String sql){
		char[] ch = sql.toCharArray();
		ch[ch.length-1]=')';
		return new String(ch);
	}
}
