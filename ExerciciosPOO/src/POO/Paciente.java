package POO;

public class Paciente {
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	private String patologia;
	private int idade;
	private int telefone;
	
	public Paciente(String nome, String cpf, String endereco, String email, String patologia, int idade, int telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
		this.patologia = patologia;
		this.idade = idade;
		this.telefone = telefone;		
	}
	
	public void validarCpf() 
	{
		if (cpf.length()!=11) {
			System.out.println("--Cpf inválido!!");
		}else {
			System.out.println("--Cpf válido!");
		}
				
	}
	
	 public void imprimirInfo (){
		    System.out.println("Nome do(a) paciente: "+nome+"\nCpf: "+cpf+"\nPatologia: "+patologia+"\nIdade: "+idade+"\nTelefone: "+telefone+"\nEndereço: "+endereco+"\nE-mail: "+email);
	 }
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPatologia() {
		return patologia;
	}

	public void setPatologia(String patologia) {
		this.patologia = patologia;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	
	
}
