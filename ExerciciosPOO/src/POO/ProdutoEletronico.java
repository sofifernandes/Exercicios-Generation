package POO;

public class ProdutoEletronico {
	private String tipo;	
	private String descricao;
	private float preco;
	private int  quantidade_atual;
	private int  estoque;
	
	public ProdutoEletronico (String tipo, String descricao, float preco,int quantidade_atual, int estoque) {
		this.tipo = tipo;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade_atual = quantidade_atual;
		this.estoque = estoque;
	}
	
	public void imprimirInfo() {
		System.out.println("Produto: "+tipo+"\nPreço: "+preco+"\nDescrição: "+descricao+"\nQuantidade desejada do produto: "+quantidade_atual+"\nQuantidade disponível em estoque: "+estoque);
	}
	
	public void verificaDisponibilidade() {
		if (quantidade_atual<=estoque) {
			System.out.println("\nHá disponibilidade desse produto no estoque");
			float preco_final = quantidade_atual*preco;
			System.out.println("O valor a ser pago é de: "+preco_final+"\n");
		} else {
			System.out.println("\nNão há disponibilidade desse produto no estoque. Escolha outro, por gentileza.");
		}
		
					
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade_atual() {
		return quantidade_atual;
	}

	public void setQuantidade_atual(int quantidade_atual) {
		this.quantidade_atual = quantidade_atual;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
	
	
	
	
}
