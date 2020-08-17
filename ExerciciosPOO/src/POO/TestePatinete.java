package POO;

public class TestePatinete {
	public static void main(String args[]) {
		
		Patinete p1 = new Patinete("Frog Ski", "Preto", 5, 6, 15);
		p1.imprimirInfo();
		p1.verificarTamanhoRoda();
		p1.pararPatinete();
		
		System.out.println("\n");
		Patinete p2 = new Patinete("Atrio", "Amarelo", 4, 4, 0);
		p2.imprimirInfo();
		p2.verificarTamanhoRoda();
		p2.andarPatinete();
		
		
	}
}
