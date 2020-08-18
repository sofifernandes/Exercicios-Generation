package entregar_poo3;

import java.util.ArrayList;
import java.util.Collection;

public class Estoque {
public static void main(String args[]) {
		
		Collection<String> estoque = new ArrayList<String>();
		estoque.add("Vassoura");
		estoque.add("Rodo");
		estoque.add("Pano");
		estoque.add("Balde");
		
		System.out.println("Lista inicial de produtos no estoque: "+estoque);
		
		estoque.remove("Pano");
		
		System.out.println("Lista de produtos no estoque após remoção de um item: "+estoque);
		
	     estoque.add("Produto de limpeza");
	     
	     System.out.println("Lista atualizada de produtos no estoque: "+estoque);
		
			
	}
	
		
}
