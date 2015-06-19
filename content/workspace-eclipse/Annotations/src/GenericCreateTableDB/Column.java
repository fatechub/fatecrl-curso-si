package GenericCreateTableDB;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Politica de retencao
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column { // TABELA
	String nome();
}
