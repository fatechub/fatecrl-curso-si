package ex1;

public class Main {
	
	public static String dropTable(Object o){
		String sql = "DROP TABLE ";
		Class<?> clazz = o.getClass();
		return sql + clazz.getSimpleName();
	}

	public static void main(String[] args) {		
		System.out.println( dropTable(new Cliente()) );
		// console: DROP TABLE Cliente
	}

}
