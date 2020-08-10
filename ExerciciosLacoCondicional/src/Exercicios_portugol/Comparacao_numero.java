package Exercicios_portugol;

import java.util.Scanner;

public class Comparacao_numero {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		float N;
		System.out.printf("Digite um número: ");
		N = ler.nextFloat();
		if (N>100) 
		{
			System.out.printf("O número digitado é igual a: "+N);
		}else {
			N=0;
			System.out.printf("O número digitado é igual a: "+N);
		}		
	}
}
