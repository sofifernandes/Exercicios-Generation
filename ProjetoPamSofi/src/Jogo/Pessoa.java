package Jogo;

// cria��o de classe
public class Pessoa {
	//cria��o de atributos
	public String nome;
	private String email;	
	
	//cria��o do m�todo construtor
	public Pessoa(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	//cria��o dos getter e setter para puxar infomra��es
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
	