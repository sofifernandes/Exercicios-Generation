package Exercicios_Entrega;

import java.util.Scanner;

public class idade {
	public static void main (String args[]) 
	{
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int dias, dias1, anos, meses;
		String nome;
		System.out.println("Por gentileza, digite seu nome: ");
		nome = ler.nextLine();
		System.out.println(nome+", agora digite sua idade em dias: ");
		dias1 = ler.nextInt();
		anos = dias1/365;
		meses = (dias1%365)/30;
		dias = (dias1%365)%30;
		System.out.println("Sua idade em anos, meses e dias, respectivamente, é igual a: "+ anos + " anos, " + meses + " meses e " + dias + " dias.");
						
	}
}
