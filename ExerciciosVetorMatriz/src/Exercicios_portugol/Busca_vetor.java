package Exercicios_portugol;

import java.util.Scanner;

public class Busca_vetor {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int vetor[] = new int[5];
		int x, maior=0;
		
		for (x=0;x<5;x++) {
			System.out.println("Digite um n�mero: ");
			vetor[x] = entrada.nextInt();
			if (vetor[x]>maior) {
				maior = vetor[x];
			}
		}
		for (x=0;x<5;x++) {
			System.out.println("\nValor Posi��o "+x+": "+ vetor[x]);
		}
		System.out.println("\n\nA maior pontua��o entre os n�meros apresentados �: "+ maior + "\n");
	}
}
