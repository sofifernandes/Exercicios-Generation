package Exercicios_entrega;

import java.util.Scanner;

public class Maior_Numero {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3;
		System.out.printf("Por gentileza, digite o primeiro n�mero: ");
		n1 = ler.nextInt();
		System.out.printf("Agora, digite o segundo n�mero: ");
		n2 = ler.nextInt();
		System.out.printf("Por fim, digite o terceiro n�mero: ");
		n3 = ler.nextInt();
		if (n1>n2 && n1>n3) {
			System.out.printf("O maior n�mero entre os 3 digitados �: "+n1);
		}else if (n2>n1 && n2>n3) {
			System.out.printf("O maior n�mero entre os 3 digitados �: "+n2);
		}else {
			System.out.printf("O maior n�mero entre os 3 digitados �: "+n3);
		}
		
	}
}
