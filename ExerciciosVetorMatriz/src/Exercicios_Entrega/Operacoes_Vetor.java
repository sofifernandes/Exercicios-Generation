package Exercicios_Entrega;

import java.util.Scanner;

public class Operacoes_Vetor {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int vetor1[] = new int[6];
		int soma_par=0, soma_impar=0, num_par=0, num_impar=0;
		
		for(int i=0; i<6; i++) {
				System.out.println("Digite um número: ");
				vetor1[i] = entrada.nextInt();
				
		}
		System.out.println("\n");
		for(int i=0; i<6; i++) {		
				if (vetor1[i]%2==0) {
					soma_par = soma_par + vetor1[i];
					num_par = vetor1[i];
					System.out.println("Valor "+(i+1)+" = "+num_par+"\t(par).");
							
				}
				else {
					soma_impar = soma_impar + vetor1[i];
					num_impar = vetor1[i];	
					System.out.println("Valor "+(i+1)+" = "+num_impar+"\t(ímpar).");
				}
					
		 }
		
		System.out.println("\nA soma dos números pares desse vetor é igual a: "+soma_par);
		System.out.println("\nA soma dos números ímpares desse vetor é igual a: "+soma_impar);
	}
}
