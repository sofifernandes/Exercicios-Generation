package entregar_poo3;

public class TesteAnimal {
	public static void main(String args[]) {
		
		Cachorro c1 = new Cachorro("N�o est� correndo!");	
		Cavalo cv1 = new Cavalo("N�o est� correndo!");	
		Preguica p1 = new Preguica("Est� subindo na �rvore!");
		
		c1.emitirSom("Au au");
		cv1.emitirSom("Hihihihihi");
		p1.emitirSom("aaaa...eee...eee");	
		
		System.out.println("\n");
		
		Cachorro c2 = new Cachorro("Est� correndo!");	
		Cavalo cv2 = new Cavalo("Est� correndo!");	
		Preguica p2 = new Preguica("Est� subindo na �rvore!");
		
		c2.emitirSom("Au au");
		cv2.emitirSom("Hihihihihi");
		p2.emitirSom("aaaa...eee...eee");		
		
	}
}


