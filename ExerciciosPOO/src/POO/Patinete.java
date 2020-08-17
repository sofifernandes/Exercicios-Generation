package POO;

public class Patinete {
	private String modelo;
	private String cor;
	private double tamanho_roda;
	private double tamanho_ideal;
	private double velocidade;
	
	
	public Patinete (String modelo, String cor, double tamanho_roda, double tamanho_ideal, double velocidade) {
		this.modelo = modelo;
		this.cor = cor;
		this.tamanho_roda = tamanho_roda;
		this.tamanho_ideal = tamanho_ideal;
		this.velocidade = velocidade;
	}
	public void imprimirInfo() {
		System.out.println("Modelo: "+modelo+"\nCor: "+cor+"\nTamanho da roda atual: "+tamanho_roda+"\nTamanho ideal: "+tamanho_ideal+"\nVelocidade atual: "+velocidade);
	}

	public void pararPatinete() {
		if (velocidade>0) {
			velocidade = 0;
			System.out.println("\nSeu patinete está parado agora!");
		}
	}
	
	public void andarPatinete() {
		if (velocidade==0) {
			velocidade = velocidade+1;
			System.out.println("\nVocê e seu patinete estão em movimento agora!");
		}
	}
	
	public void verificarTamanhoRoda() {
		if (tamanho_roda>tamanho_ideal) {
			System.out.println("\nO tamanho da roda utilizada está adequada ao seu patinete");
		} else {
			System.out.println("\nO tamanho da roda utilizada não está adequada ao seu patinete");
		}
	}
	
	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public double getTamanho_roda() {
		return tamanho_roda;
	}


	public void setTamanho_roda(double tamanho_roda) {
		this.tamanho_roda = tamanho_roda;
	}


	public double getTamanho_ideal() {
		return tamanho_ideal;
	}

	public void setTamanho_ideal(double tamanho_ideal) {
		this.tamanho_ideal = tamanho_ideal;
	}

	public double getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
		
	
	
}


