package PacoteJava;

import java.util.Scanner;

public class Repeticao3 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int idade;
		do
		{			
			System.out.printf("Entre com a sua idade: ");
			idade = ler.nextInt();
			if (idade>=18) {
				System.out.printf("\nVoc� � de maior!");
			}else {
				System.out.printf("\nVoc� � de menor!");
			}
		}	
		while (idade >= 1);
	 }	
}
