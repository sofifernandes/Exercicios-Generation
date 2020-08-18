package entregar_poo3;

public class Cachorro extends Animal {
	private String correr;

	public Cachorro(String correr) {
		super();
		this.correr = correr;
	}
	public void emitirSom(String som) {		 
		if (correr=="N�o est� correndo!") {
			System.out.println(som);
		}else {
			System.out.println("O cachorro est� em sil�ncio");
		}
				
	}
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	
}
