package POO;

public class TesteCliente {
	public static void main (String args []) {
	      Cliente c1 = new Cliente ("Carla", "00011122233", 22, 944444444, "Rua fulana, nº111", "carlinha23@outlook.com");
	      c1.imprimirInfo();
	      c1.validarCpf();
	      
	      System.out.println("\n");
	      
	      Cliente c2 = new Cliente ("Eleonor", "00022233344", 26, 942424242, "Rua qualquer, nº222", "eleonorgatinha@outlook.com");
	      c2.imprimirInfo();
	      c2.validarCpf();
	      
	      System.out.println("\n");
	      
	      Cliente c3 = new Cliente ("Kleber", "000666000999", 31, 942424243, "Rua qualquer, nº223", "kleber@outlook.com");
	      c3.imprimirInfo();
	      c3.validarCpf();
	      
	      System.out.println("\n");
	      
	      System.out.println("Novo cpf para Kleber: \n");
	      c3.setCpf("00022233366");
	      c3.imprimirInfo();
	      c3.validarCpf();	      
	      
	      
	}

}
