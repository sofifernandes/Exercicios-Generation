package POO2;

public class TesteVendedor {
	public static void main(String args[]) {
		
		Vendedor joao = new Vendedor ("João", "Rua coca-cola, nº33","42042042042",945454545,33,"Móveis",600,20, 8, 8);
	
		joao.imprimirInfo();
		joao.calcularSalario();
	
		
		Vendedor sabrina = new Vendedor ("Sabrina", "Rua coca-cola, nº44","43042042042",945453939,31,"RH",700,20, 8, 7);
		
		sabrina.imprimirInfo();
		sabrina.calcularSalario();		
		
	}
	
}
