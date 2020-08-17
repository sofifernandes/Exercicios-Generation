package POO2;

public class TesteAdministrador {
		public static void main(String args[]) {
			
			Administrador jose = new Administrador("José", "Rua pinheiro, nº55", "48048048048", 948484848, 30, 256.50, 700.00);
			
			jose.imprimirInfo();
			jose.validarCpf();
			jose.verificaAjudaDeCusto();
		
			
		}
}
