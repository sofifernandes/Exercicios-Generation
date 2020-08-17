package POO;

public class ContaBancaria {
	private String nome_dono;
	private String cpf_dono;
	private String endereco_dono;
	private String email_dono;
	private int idade_dono;
	private int telefone_dono;
	private float saldo_atual;
	
	
	public ContaBancaria(String nome_dono, String cpf_dono, String endereco_dono, String email_dono, int idade_dono, int telefone_dono, float saldo_atual) {
		this.nome_dono = nome_dono;
		this.cpf_dono = cpf_dono;
		this.endereco_dono = endereco_dono;
		this.email_dono = email_dono;
		this.idade_dono = idade_dono;
		this.telefone_dono = telefone_dono;
		this.saldo_atual = saldo_atual;
	}
	
	public void validarCpf() 
	{
		if (cpf_dono.length()!=11) {
			System.out.println("\n--Cpf inválido!!");
		}else {
			System.out.println("\n--Cpf válido!");
		}				
	}
	
	public void imprimirInfo (){
	    System.out.println("Nome do(a) cliente: "+nome_dono+"\nCpf: "+cpf_dono+"\nIdade: "+idade_dono+"\nTelefone: "+telefone_dono+"\nEndereço: "+endereco_dono+"\nE-mail: "+email_dono+"\nSaldo atual da conta: "+saldo_atual);
	}
	
	public void verificarEstadoConta() {
		if (saldo_atual<0) {
			System.out.println("\n--Sua conta está negativa!");
		}
		else {
			System.out.println("\n--Sua conta esta positiva!");
		}
	}

	public String getNome_dono() {
		return nome_dono;
	}


	public void setNome_dono(String nome_dono) {
		this.nome_dono = nome_dono;
	}


	public String getCpf_dono() {
		return cpf_dono;
	}


	public void setCpf_dono(String cpf_dono) {
		this.cpf_dono = cpf_dono;
	}


	public String getEndereco_dono() {
		return endereco_dono;
	}


	public void setEndereco_dono(String endereco_dono) {
		this.endereco_dono = endereco_dono;
	}


	public String getEmail_dono() {
		return email_dono;
	}


	public void setEmail_dono(String email_dono) {
		this.email_dono = email_dono;
	}


	public int getIdade_dono() {
		return idade_dono;
	}


	public void setIdade_dono(int idade_dono) {
		this.idade_dono = idade_dono;
	}


	public int getTelefone_dono() {
		return telefone_dono;
	}


	public void setTelefone_dono(int telefone_dono) {
		this.telefone_dono = telefone_dono;
	}


	public float getSaldo_atual() {
		return saldo_atual;
	}


	public void setSaldo_atual(float saldo_atual) {
		this.saldo_atual = saldo_atual;
	}
	
	
	
	
	
	
}
