package ValidarNotNullEMaiorIdade;

import java.lang.reflect.Field;

public class Validator {
	public static boolean isValid(Object o) throws IllegalArgumentException, IllegalAccessException{
		Class<?> clazz = o.getClass();
		Field[] fs = clazz.getDeclaredFields();
		for(Field f : fs){
			if(f.isAnnotationPresent(NotNull.class)){
				f.setAccessible(true);
				String conteudo = (String) f.get(o);
				if(conteudo != null){
					if(conteudo.equals(""))
						return false;
				}else {
					return false;
				}				
			}
			
			if(f.isAnnotationPresent(isMaior.class)){
				f.setAccessible(true);
				int idade = (int) f.get(o);
				if(idade <= 18)
					return false;		
			}
		}
		return true;
	}
}
