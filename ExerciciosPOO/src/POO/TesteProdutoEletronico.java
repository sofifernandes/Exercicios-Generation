package POO;
public class TesteProdutoEletronico {
	public static void main(String args[]) {
		
		ProdutoEletronico p1 = new ProdutoEletronico ("Celular","Celular 4g", 499 ,2, 90 );
		p1.imprimirInfo();
		p1.verificaDisponibilidade();
		
		
		ProdutoEletronico p2 = new ProdutoEletronico ("Notebook","DVD Samsung", 600 , 15, 10 );
		p2.imprimirInfo();
		p2.verificaDisponibilidade();
		
	
		p2.setTipo("Dvd");
		p2.setQuantidade_atual(8);
		p2.setEstoque(12);
		System.out.println("\n");
		System.out.println("Novo produto: ");
		p2.imprimirInfo();
		p2.verificaDisponibilidade();
		
	}
}
