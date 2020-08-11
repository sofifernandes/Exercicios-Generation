package Exercicios_Portugol;

import java.util.Scanner;

public class Soma_regressiva_numeros {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int num, soma_num=0;
		System.out.println("Por gentileza, digite um número: ");
		num = ler.nextInt();
		do {
			soma_num = soma_num+num;
			num--;
		}while (num>=0);
		System.out.println("\nA soma dos números até o número digitado é igual a: "+soma_num+"\n");
		
	}
}
