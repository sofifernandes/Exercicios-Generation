package entregar_poo3;

public class Cavalo extends Animal {
	private String correr;

	public Cavalo(String correr) {
		super();
		this.correr = correr;
	}
	public void emitirSom(String som) {		 
		if (correr=="Está correndo!") {
			System.out.println(som);
		}else {
			System.out.println("O cavalo está em silêncio");
		}
				
	}
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	
}

