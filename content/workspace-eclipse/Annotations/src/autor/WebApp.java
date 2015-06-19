package autor;

public class WebApp {
	@Autor(nome = "Adam", tempo = 10.00)
	public void atualizarBanner() {
		System.out.println("Atualizou banners...");
	}

	@Autor(tempo = 3.00, nome = "Ramon")
	public void backup() {
		System.out.println("Fez Backups...");
	}

	@Autor
	public void fecharSession() {
		System.out.println("Fechou sessao");
	}
}

