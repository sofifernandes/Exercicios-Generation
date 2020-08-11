package Lista_completa_java;

import java.util.Scanner;

public class Classificacao_idade {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int idade=0, cont1=0, cont2=0;
		while (idade!=-99) {
			System.out.println("Digite sua idade, por gentileza: ");
			idade = ler.nextInt();
			if (idade<21 && idade!=-99) {
				cont1++;
			}
			if (idade>50) {
				cont2++;
			}
		}
		System.out.println("O número de pessoas com menos de 21 anos é igual a: "+cont1);
		System.out.println("O número de pessoas com mais de 50 anos é igual a: "+cont2);
		
	}
}
