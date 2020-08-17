package POO2;

public class Administrador extends Pessoa {
	private double ajusteDeCusto;
	private double salarioBase;
	
	public Administrador(String nome, String endereco, String cpf, int telefone, int idade, double ajusteDeCusto,
			double salarioBase) {
		super(nome, endereco, cpf, telefone, idade);
		this.ajusteDeCusto = ajusteDeCusto;
		this.salarioBase = salarioBase;
	}
	
	
	public void imprimirInfo (){
	    System.out.println("\nNome do empregado: "+getNome()+"\n"+"Cpf: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()+"\n"+"Endereço: "+getEndereco()+"\nSalário fixo: "+salarioBase+"\nAjuste de custo deste mês: "+ajusteDeCusto);
	}
	
	public void verificaAjudaDeCusto() {
		double valor_final = salarioBase+ajusteDeCusto;
		System.out.println("A ajuda de custo deste mês será de: "+ajusteDeCusto+", e o valor do salários final a ser recebido é de: "+valor_final);
	}

	public double getAjusteDeCusto() {
		return ajusteDeCusto;
	}

	public void setAjusteDeCusto(double ajusteDeCusto) {
		this.ajusteDeCusto = ajusteDeCusto;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
		
	
}
	
