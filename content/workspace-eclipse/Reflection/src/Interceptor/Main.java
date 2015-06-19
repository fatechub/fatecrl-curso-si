/*
 * (Interceptação de métodos) Crie uma annotation @Interceptor que possua como valor String um nome de método (`met`) e um Class (`cl`) que representa uma classe.
 * Faça uma classe `Foo` com os métodos privados `void fazAlgo()` que mostra na tela o nome do método e `void fazNada()` que mostra a mensagem nada, apenas para teste. 
 * Faça uma classe `Bar` com um método `void hello()` publico que mostra uma mensagem de boas-vindas. Este método deve ser marcado com a annotation **@Interceptor** de modo a ter o nome do método de sua escolha (*fazNada, fazAlgo*) e um `Foo.class`. 
 * Faça uma classe `Delegator` que possua o método `void voidExecutor(Object, String)` que recebe um Object de referencia e um nome de método. Se o método não existir, exiba um erro. Se existir procure pela annotation **@Interceptor** e execute o método definido nesta annotation. Após a execução do método definido na annotation. o método em questão de dentro de voidExecutor deve ser chamado tambem.
 */
package Interceptor;

import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException {
		Delegator d = new Delegator();
		d.voidExecutor( new Bar(), "hello" );
	}

}
