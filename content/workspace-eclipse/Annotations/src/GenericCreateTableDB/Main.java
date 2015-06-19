package GenericCreateTableDB;

public class Main {

	public static void main(String[] args) throws Exception { 
        Login l = new Login(1, "teste", "root");
        System.out.println(l);
        
        GenericCreate c = new GenericCreate();
        System.out.println( c.create(l) );
        
        /*
         * exemplo4.Login@15db9742
		   CREATE TABLE TB_LOGIN( CD_LOGIN int,NM_LOGIN vachar(10),PS_SENHA vachar(60)
         */
	}

}
