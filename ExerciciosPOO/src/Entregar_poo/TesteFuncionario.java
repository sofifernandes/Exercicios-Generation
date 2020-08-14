package Entregar_poo;

public class TesteFuncionario {
	public static void main (String args []) {
	      Funcionario f1 = new Funcionario ("Sabrina", "00011122233", 22, 944444444, "Rua fulana, n�111", "sabrina@outlook.com", 1256);
	      f1.imprimirInfo();
	      f1.validarCpf();
	      f1.verificarCodigo();  
	      
	      Funcionario f2 = new Funcionario ("Carlos", "0001112223389", 28, 944444546, "Rua qualquer, n�22", "calors16@outlook.com", -1236);
	      f2.imprimirInfo();
	      f2.validarCpf();
	      f2.verificarCodigo();  
	      
	      System.out.println("\n");
	      System.out.println("Nova verifica��o de cpf e c�digo: ");
	      f2.setCodigo(1236);
	      f2.setCpf("00099933366");
	      f2.imprimirInfo();
	      f2.validarCpf();
	      f2.verificarCodigo();     

	}
}
