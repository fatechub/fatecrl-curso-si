package autor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	static void scheduler(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Double tempo_aux = 0.0;
		Class<?> clazz = obj.getClass();
		Method[] m = clazz.getDeclaredMethods();
		for (Method n : m) {
			if (n.isAnnotationPresent( Autor.class )) {
				Autor a = n.getAnnotation( Autor.class );
				String nome = a.nome();
				Double tempo = a.tempo();
				System.out.println("METODO " + n.getName() + " EXECUTADO POR: "	+ nome + " GASTOU " + tempo + " HORAS");
				tempo_aux += tempo;
			}
		}
		System.out.println("\nTOTAL DE HORAS DE TODOS: " + tempo_aux);
	}

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		WebApp app = new WebApp();
		scheduler(app);
		/*
		 * METODO backup EXECUTADO POR: Ramon GASTOU 3.0 HORAS
			METODO atualizarBanner EXECUTADO POR: Adam GASTOU 10.0 HORAS
			METODO fecharSession EXECUTADO POR: Flavia GASTOU 5.0 HORAS
			
			TOTAL DE HORAS DE TODOS: 18.0
		 */
	}

}
