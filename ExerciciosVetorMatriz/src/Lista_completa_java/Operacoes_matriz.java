package Lista_completa_java;

import java.util.Scanner;

public class Operacoes_matriz {	
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int [][] matriz = new int[3][3];
		int cont=0;
		
		for(int linha=0; linha<3; linha++) {
			for(int coluna = 0; coluna<3; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha+1, coluna+1);
				matriz[linha][coluna]=entrada.nextInt();
				if (matriz[linha][coluna]>10) {
					cont++;
				}
			}			
		}
		System.out.println("\nA matriz apresentada possui --" +cont+ "-- valores maiores que 10.");
		
		
	}
}
