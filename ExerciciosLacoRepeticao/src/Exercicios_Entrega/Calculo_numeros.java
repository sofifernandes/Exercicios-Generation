package Exercicios_Entrega;

import java.util.Scanner;

public class Calculo_numeros {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int num, cont=0, soma_num=0;
		float media;
		do {
			System.out.println("Digite um n�mero: ");
			num = ler.nextInt();
			if (num%3==0 && num!=0) {
				soma_num = soma_num+num;
				cont++;
			}
		}
		while(num!=0);
		media = soma_num/cont;
		System.out.println("A m�dia dos n�meros m�ltiplos de 3 � igual a: "+media);
			
	}
}
