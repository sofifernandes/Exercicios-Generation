package Exercicios_portugol;

import java.util.Scanner;

public class Comparacao_numero {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		float N;
		System.out.printf("Digite um n�mero: ");
		N = ler.nextFloat();
		if (N>100) 
		{
			System.out.printf("O n�mero digitado � igual a: "+N);
		}else {
			N=0;
			System.out.printf("O n�mero digitado � igual a: "+N);
		}		
	}
}
