package POO;

import java.util.Scanner;

public class Funcionario {
	private String nome;
	private String cpf;
	private int idade;
	private int telefone;
	private String endereco;
	private String email;	
	private int codigo;
	Scanner ler = new Scanner(System.in);
	
	public Funcionario (String nome, String cpf, int idade, int telefone,String endereco, String email, int codigo) {
		this.nome = nome;
	    this.cpf = cpf;
	    this.idade = idade;
	    this.telefone = telefone;
	    this.endereco = endereco;
	    this.email = email;  	
	    this.codigo=codigo;
	}
	
	public void  validarCpf() 
	{
		System.out.println("Nos informe seu cpf: ");
		cpf = ler.nextLine();
		if (cpf.length()!=11) {
			System.out.println("\n--Cpf inválido!!");
		}else {
			System.out.println("\n--Cpf válido!");
		}
				
	}
	
	public void verificarCodigo() {
		if (codigo<0) {
			System.out.println("--Código inválido!\n");
		}else {
			System.out.println("--Código válido!\n");
		}
		
	}
	
	public void imprimirInfo (){
	    System.out.println("Nome do(a) funcionário(a): "+nome+"\n"+"Cpf: "+cpf+"\n"+"Idade: "+idade+"\n"+"Telefone: "+telefone+"\n"+"Endereço: "+endereco+"\n"+"E-mail: "+email+"\n"+"Código: "+codigo);
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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
	
}
