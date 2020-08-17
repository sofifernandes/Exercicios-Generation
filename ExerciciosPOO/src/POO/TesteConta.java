package POO;

public class TesteConta {
		public static void main(String args[]) {
			
			ContaBancaria c1 = new ContaBancaria("Samanta","80060090033", "Rua querida, nº86", "samanta@outlook.com", 30, 988888888, 400);
			c1.imprimirInfo();
			c1.validarCpf();
			c1.verificarEstadoConta();		
			
			
		}
	
	
}
