package POO2;

public class TesteAdministrador {
		public static void main(String args[]) {
			
			Administrador jose = new Administrador("Jos�", "Rua pinheiro, n�55", "48048048048", 948484848, 30, 256.50, 700.00);
			
			jose.imprimirInfo();
			jose.validarCpf();
			jose.verificaAjudaDeCusto();
		
			
		}
}
