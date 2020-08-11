package Exercicios_Portugol;

import java.util.Scanner;

public class Multiplicacao_numero {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.println("Por gentileza, digite um número: ");
		num = ler.nextInt();
		System.out.println("\n"+ num);
		while (num<=100) {
			num = num*3;
			System.out.println("\n"+num+"\n");
		}		
	}
}
