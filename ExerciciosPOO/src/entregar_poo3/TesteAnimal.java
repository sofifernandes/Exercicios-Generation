package entregar_poo3;

public class TesteAnimal {
	public static void main(String args[]) {
		
		Cachorro c1 = new Cachorro("Não está correndo!");	
		Cavalo cv1 = new Cavalo("Não está correndo!");	
		Preguica p1 = new Preguica("Está subindo na árvore!");
		
		c1.emitirSom("Au au");
		cv1.emitirSom("Hihihihihi");
		p1.emitirSom("aaaa...eee...eee");	
		
		System.out.println("\n");
		
		Cachorro c2 = new Cachorro("Está correndo!");	
		Cavalo cv2 = new Cavalo("Está correndo!");	
		Preguica p2 = new Preguica("Está subindo na árvore!");
		
		c2.emitirSom("Au au");
		cv2.emitirSom("Hihihihihi");
		p2.emitirSom("aaaa...eee...eee");		
		
	}
}


