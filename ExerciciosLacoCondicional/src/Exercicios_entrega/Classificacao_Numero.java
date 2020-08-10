package Exercicios_entrega;

import java.util.*;

public class Classificacao_Numero {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		float num;
		double num_quadrado=0, raiz_quadrada=0;
		System.out.printf("Por gentileza, digite um número: ");
		num = ler.nextFloat();
		if (num%2==0) {
			raiz_quadrada = Math.sqrt(num);
			System.out.printf("O número digitado, "+num+", é par, e a raiz quadrada deste número é igual a: "+raiz_quadrada);
		}else {
			num_quadrado = Math.pow(num, 2);
			System.out.printf("O número digitado, "+num+", é ímpar, e o quadrado deste número é igual a: "+num_quadrado);
		}
	}	
}
