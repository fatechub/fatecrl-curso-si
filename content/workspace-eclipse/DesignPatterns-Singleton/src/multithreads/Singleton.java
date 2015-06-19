package multithreads;

/*
 * Singleton: Quebrando o Patterns com multi-threads. "By Patrick"
 */
public class Singleton {
	
	private static Singleton s;
	private static String t1 = "";
	private static String t2 = "";

	private Singleton() {}
	
	public static Singleton getInstance() {
		if (s == null) s = new Singleton();
		return s;
	}	
	
	public static void main(String... args) {
		int i = 0;
		while (i < 3) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					t1 = getInstance().toString();
				}
			}).start();
			new Thread(new Runnable() {
				@Override
				public void run() {
					t2 = getInstance().toString();
				}
			}).start();
			if (!t1.equals(t2)) {
				System.out.println(t1 + "\n" + t2 + "\n");
				i++;
			}
			s = null;
		}
	}
}

