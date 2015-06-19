package ordem;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Para definir o tipo de target
@Target(ElementType.METHOD)

// Sem isso o reflexion nao enxerga
@Retention(RetentionPolicy.RUNTIME) 

public @interface Ordem {
	int numero();
}
