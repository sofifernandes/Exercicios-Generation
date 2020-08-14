package Entregar_poo;

public class Aviao {
	private String porte;
	private String empresa;
	private int numeroLugares;
	private int combustivelAtual;
	private int combustivelNecessario;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	
	
	public Aviao (String porte, String empresa, int numeroLugares, int combustivelAtual,int combustivelNecessario, double velocidadeAtual,double velocidadeMaxima ) {
		this.porte = porte;
		this.empresa = empresa;
		this.numeroLugares = numeroLugares;
		this.combustivelAtual = combustivelAtual;
		this.combustivelNecessario = combustivelNecessario;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	 public void imprimirInfo (){
		    System.out.println("Porte do avi�o: "+porte+"\n"+"Empresa: "+empresa+"\n"+"N�mero de lugares:  "+numeroLugares+"\n"+"Combust�vel atual: "+combustivelAtual+"\n"+"Quantidade de combust�vel necess�ria: "+combustivelNecessario+"\n"+"Velocidade atual: "+velocidadeAtual+"\n"+"Velocidade m�xima: "+velocidadeMaxima+"\n");
	 }
	 public void imprimirNovaInfo (){
		    System.out.println("Velocidade atual: "+velocidadeAtual);
	 }
	
	int verificarVelocidade() 
	{
		if (this.velocidadeAtual>velocidadeMaxima) {
			double velocidadeExcedida= velocidadeAtual-velocidadeMaxima;
			System.out.println("--Diminua a velocidade, pois est� ultrapassando os limites aceit�veis em "+velocidadeExcedida+"km/h.");
		}else {
			System.out.println("--A velocidade est� dentro do limite aceit�vel.");
		}
		return 1;		
	}
	int verificarCombustivel() 
	{
		if (this.combustivelAtual<combustivelNecessario) {
			System.out.println("--Urgente!! Fa�a uma parada para encher o tanque deste avi�o no n�vel necess�rio!");
		}else {
			System.out.println("--O combust�vel est� dentro do n�vel aceit�vel \n");
		}
		return 1;		
	}
	

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getNumeroLugares() {
		return numeroLugares;
	}

	public void setNumeroLugares(int numeroLugares) {
		this.numeroLugares = numeroLugares;
	}

	public int getCombustivelAtual() {
		return combustivelAtual;
	}

	public void setCombustivelAtual(int combustivelAtual) {
		this.combustivelAtual = combustivelAtual;
	}

	public int getCombustivelNecessario() {
		return combustivelNecessario;
	}

	public void setCombustivelNecessario(int combustivelNecessario) {
		this.combustivelNecessario = combustivelNecessario;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	
	
	
	
}
