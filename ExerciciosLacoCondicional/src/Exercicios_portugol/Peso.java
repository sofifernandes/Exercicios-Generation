package Exercicios_portugol;

import java.util.Scanner;

public class Peso {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		double altura, peso=0;
		String nome;
		int sexo;
		System.out.println("Por gentileza, digite o seu nome: ");
		nome = ler.nextLine();
		System.out.println(nome+", qual sua altura?");
		altura = ler.nextDouble();
		System.out.println("Agora, nos informe qual seu sexo (1- masculino/ 2- feminino): ");
		sexo = ler.nextInt();
		if (sexo == 1)
		{
			peso = (72.7*altura)-58;
			System.out.println(nome+", seu peso ideal é igual a: "+peso);
			
		}
		else 
		{
			peso = (62.1*altura)-44.7;
			System.out.println(nome+", seu peso ideal é igual a: "+peso);
		}
				
	}
	
}
