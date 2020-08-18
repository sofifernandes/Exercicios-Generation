package entregar_poo3;

public class Preguica extends Animal {
	private String subirArvore;

	public Preguica(String subirArvore) {
		super();
		this.subirArvore = subirArvore;
	}
	public void emitirSom(String som) {		 
		System.out.println(som);		
	}
	public String getSubirArvore() {
		return subirArvore;
	}
	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	
	
}
