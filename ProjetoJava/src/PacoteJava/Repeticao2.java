package PacoteJava;

import java.util.Scanner;

public class Repeticao2 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.printf("Entre com a sua idade: ");
		idade = ler.nextInt();
		
		while (idade >= 1)
		{
			System.out.printf("Sua idade: %d", idade);
			if (idade>=18) {
				System.out.printf("\nVocê é de maior!");
			}else {
				System.out.printf("\nVocê é de menor!");
			}
			System.out.printf("\nEntre com a sua idade: ");
			idade = ler.nextInt();
			
		}		
	}
}
