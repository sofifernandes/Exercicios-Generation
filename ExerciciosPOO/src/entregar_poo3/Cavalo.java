package entregar_poo3;

public class Cavalo extends Animal {
	private String correr;

	public Cavalo(String correr) {
		super();
		this.correr = correr;
	}
	public void emitirSom(String som) {		 
		if (correr=="Est� correndo!") {
			System.out.println(som);
		}else {
			System.out.println("O cavalo est� em sil�ncio");
		}
				
	}
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	
}

