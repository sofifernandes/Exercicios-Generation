package Lista_completa_java;

import java.util.Scanner;

public class Encontrar_numero {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int num, soma_num=0;
		do {
			System.out.println("Digite um n�mero: ");
			num = ler.nextInt();
			soma_num = soma_num+num;
		}
		while(num!=0);
		System.out.println("A soma dos n�meros digitados � igual a: "+soma_num);
		
	}
}
