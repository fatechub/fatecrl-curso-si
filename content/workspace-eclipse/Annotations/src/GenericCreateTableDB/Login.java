package GenericCreateTableDB;

@Table(nome="TB_LOGIN")
public class Login {
	@Column(nome="CD_LOGIN")
	private int id;
	@Column(nome="NM_LOGIN")
	@Varchar(qut=10)
	private String nome;
	@Column(nome="PS_SENHA")
	@Varchar(qut=60)
	private String senha;
	
	public Login(int id, String nome, String senha) {
		//super();
		this.id = id;
		this.nome = nome;
		this.senha = senha;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getSenha() {
		return senha;
	}
		 
}
