package POO;

public class Cliente {
	private String nome;
	private String cpf;
	private int idade;
	private int telefone;
	private String endereco;
	private String email;	
	
	
	public Cliente (String nome, String cpf, int idade, int telefone,String endereco, String email) {
		this.nome = nome;
	    this.cpf = cpf;
	    this.idade = idade;
	    this.telefone = telefone;
	    this.endereco = endereco;
	    this.email = email;  			
	}
	int validarCpf() 
	{
		if (cpf.length()!=11) {
			System.out.println("--Cpf inválido!!");
		}else {
			System.out.println("--Cpf válido!");
		}
		return 1;		
	}
	 public void imprimirInfo (){
		    System.out.println("Nome do(a) cliente: "+nome+"\n"+"Cpf: "+cpf+"\n"+"Idade: "+idade+"\n"+"Telefone: "+telefone+"\n"+"Endereço: "+endereco+"\n"+"E-mail: "+email);
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
	
	
	
}	
