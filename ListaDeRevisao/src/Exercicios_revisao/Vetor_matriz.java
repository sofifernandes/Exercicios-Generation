package Exercicios_revisao;

import java.util.Scanner;

public class Vetor_matriz {
	
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int[] vetor = new int[3];
		int [][] matriz = new int[3][3];
		
		
		
		
		for(int linha=0; linha<3; linha++) {
			for(int coluna = 0; coluna<3; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha, coluna);
				matriz[linha][coluna]=entrada.nextInt();
							
			}
			
		}
		for(int linha=0; linha<3; linha++) {
			System.out.println("Digite um número para o vetor: ");
			vetor[linha] = entrada.nextInt();
		}
		for(int linha=0; linha<3; linha++) {
			for(int coluna = 0; coluna<3; coluna++) {
			 matriz[linha][coluna] = vetor[linha]*matriz[linha][coluna];
							
			}
			
		}		
		System.out.println("\nA matriz multiplicada pelo vetor ficou igual a: ");				
		for(int linha=0; linha<3; linha++) {
			for(int coluna = 0; coluna<3; coluna++) {
				System.out.printf("\nM[%d][%d]: ",linha,coluna, ":");
				System.out.println(matriz[linha][coluna]);
			}
		}
	
	
	}	
}
