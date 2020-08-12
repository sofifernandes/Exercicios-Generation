package Exercicios_portugol;

import java.util.Scanner;

public class Dado_e_vetor {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int dado[] = new int[10];
		int x, soma_num=0, cont=0;
		float media;
		
		for(x=0;x<10;x++) {
			System.out.println("Insira um valor correspondente ao que apareceu ao lançar o dado: ");
			dado[x] = entrada.nextInt();
			if (dado[x]==6) {
				cont++;
			}
			soma_num = soma_num + dado[x];
		}
		for(x=0;x<10;x++) {
			System.out.println("\nValor Posição "+x+": "+ dado[x]);
		}
		media = soma_num/10;
		System.out.println("\n\nA média aritmética entre os números de lançamento é igual a: "+media);
		System.out.println("\n\nO número de ocorrências da maior pontuação é igual a: "+ cont);
	}
}
