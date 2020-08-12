package Exercicios_portugol;

import java.util.Scanner;

public class Operacoes_matriz {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int [][] N1 = new int[2][2];
		int [][] M1 = new int[2][2];
		int [][] N2 = new int[2][2];
		int [][] M2 = new int[2][2];
		
		
		for(int linha=0; linha<2; linha++) {
			for(int coluna = 0; coluna<2; coluna++) {
				System.out.printf("Insira o elemento N1[%d][%d]: ", linha, coluna);
				N1[linha][coluna]=entrada.nextInt();
			}
		}
		System.out.println("\n");
		for( int linha=0; linha<2; linha++) { 
			for(int coluna = 0; coluna<2; coluna++) {
				System.out.printf("Insira o elemento N2[%d][%d]: ", linha, coluna);
				N2[linha][coluna]=entrada.nextInt();
			}
		}
		for( int linha=0; linha<2; linha++) {
			for(int coluna = 0; coluna<2; coluna++) {
				M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna];
			}
		}
		for( int linha=0; linha<2; linha++) {
			for(int coluna = 0; coluna<2; coluna++) {
				M2[linha][coluna]=N1[linha][coluna]-N2[linha][coluna];
			}
		}
			
		System.out.println("\nMatriz M1 (adição das anteriores): ");
		for( int linha=0; linha<2; linha++) {
			for(int coluna = 0; coluna<2; coluna++) {
				System.out.printf("\nM[%d][%d]: ",linha,coluna, ":");
				System.out.println(M1[linha][coluna]);
			}
		}
		System.out.println("\nMatriz M2 (subtração das anteriores): ");
		for( int linha=0; linha<2; linha++) {
			for(int coluna = 0; coluna<2; coluna++) {
				System.out.printf("\nM[%d][%d]: ",linha,coluna, ":");
				System.out.println(M2[linha][coluna]);
			}
		}
	}
}	
