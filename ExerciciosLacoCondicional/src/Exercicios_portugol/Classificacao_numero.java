package Exercicios_portugol;

import java.util.Scanner;

public class Classificacao_numero {
	public static void main (String args[]) 
	{		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.printf("Por gentileza, digite um número:");
		num = ler.nextInt();
		if(num%2==0) {
			if (num>0) {
				System.out.printf("\nSeu valor é par e positivo.");
			}else {
				System.out.printf("\nSeu valor é par e negativo");
			}
		}else if (num>=0) {
			System.out.printf("\nSeu valor é ímpar e positivo");
		}else {
			System.out.printf("\nSeu valor é ímpar e negativo");
			
		}
		
	}

}
