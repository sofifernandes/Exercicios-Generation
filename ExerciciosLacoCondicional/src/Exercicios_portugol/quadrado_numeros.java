package Exercicios_portugol;

import java.util.*;

public class quadrado_numeros {
	public static void main (String args[]) 
	{		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		double n1, n2, n3, n4, res1, res2, res3, res4;
		System.out.println("Por favor, digite o primeiro número: ");
		n1 = ler.nextInt();
		System.out.println("Por favor, digite o segundo número: ");
		n2 = ler.nextInt();
		System.out.println("Por favor, digite o terceiro número: ");
		n3 = ler.nextInt();
		System.out.println("Por favor, digite o quarto número: ");
		n4 = ler.nextInt();
		res1 = Math.pow(n1, 2);
		res2 = Math.pow(n2, 2);
		res3 = Math.pow(n3, 2);
		res4 = Math.pow(n4, 2);
		if (res3 >= 1000) {
			System.out.printf("O quadrado do número 3 é igual a: "+ res3);
		}else {
			System.out.printf("Os quadrados dos números digitados são: " + "\nNúmero 1: " + n1 + " \nSeu valor ao quadrado: "+ res1 +"\nNúmero 2: "+n2+ " \nSeu valor ao quadrado: "+res2+"\nNúmero 3: "+n3+ " \nSeu valor ao quadrado: "+res3+"\nNúmero 4: "+n4+ " \nSeu valor ao quadrado: "+res4);
		}
				
	}
		
}
