package Exercicios_Portugol;

import java.util.Scanner;

public class idade_em_dias {
	public static void main (String args[]) 
	{
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int idade, dias, anos, meses;
		String nome;
		System.out.println("Por gentileza, digite seu nome: ");
		nome = ler.nextLine();
		System.out.println(nome+", por favor, digite sua idade em anos: ");
		anos = ler.nextInt();
		System.out.println(nome+", agora digite sua idade em meses: ");
		meses = ler.nextInt();
		System.out.println(nome+", para finalizar, digite sua idade em dias: ");
		dias = ler.nextInt();
		idade = (anos*365)+(meses*30)+(dias*1);
		System.out.println(nome+",sua idade em dias é igual a: "+idade);
		
		
	}
}
