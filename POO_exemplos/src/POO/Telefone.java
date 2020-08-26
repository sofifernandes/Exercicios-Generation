package POO;

public abstract class Telefone {
	private String tipo;
	
	//M�todo abstrato para uso em polimorfismo
	abstract public void disca(String numero);
	//M�todo abstrato para uso em polimorfismo
	abstract public void toca(int numToques);
	
	public Telefone (String tipo) {
		this.tipo=tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
		
}
