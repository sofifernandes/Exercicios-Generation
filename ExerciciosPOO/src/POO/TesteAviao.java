package POO;

public class TesteAviao {
	public static void main(String args[]) {
		
		Aviao a1 = new Aviao ("Grande porte", "Gol", 400, 800, 800, 500, 400);
		a1.imprimirInfo();
		a1.verificarVelocidade();
		a1.verificarCombustivel();
		
		System.out.println("Verificação nova de velocidade: ");
		a1.setVelocidadeAtual(300);
		a1.imprimirNovaInfo();
		a1.verificarVelocidade();
		
		System.out.println("\n");
		Aviao a2 = new Aviao ("Grande porte", "Azul", 400, 900, 1500, 399, 400);
		a2.imprimirInfo();
		a2.verificarVelocidade();
		a2.verificarCombustivel();	
		
		System.out.println("\n");		
		System.out.println("Nova verificação de combustível após encher o tanque: ");
		a2.setCombustivelAtual(1600);
		a2.imprimirInfo();
		a2.verificarCombustivel();	
		
	}
}
