package Exercicios_portugol;

import java.util.Scanner;

public class Soma_diagonal_matriz {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int [][] mat = new int[3][3];
		int soma_mat=0, soma_dia=0;
		
		for(int linha=0; linha<3; linha++) {
			for(int coluna = 0; coluna<3; coluna++) {
				System.out.printf("Insira o elemento mat[%d][%d]: ", linha, coluna);
				mat[linha][coluna]=entrada.nextInt();
				soma_mat = soma_mat + mat[linha][coluna];
			}
			System.out.println("\n");
			soma_dia = mat[0][0]+mat[1][1]+mat[2][2];
		}
		System.out.println("\n");
		System.out.println("\nA soma total dos valores desta matriz é igual a: "+soma_mat);
		System.out.println("\n\nA soma dos valores da diagonal principal desta matriz é igual a: "+soma_dia);
		
		
	}	

}
