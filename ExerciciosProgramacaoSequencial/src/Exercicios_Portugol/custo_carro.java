package Exercicios_Portugol;

import java.util.Scanner;

public class custo_carro {
	public static void main (String args[]) 
	{
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		double cf, ccon;
		System.out.printf("Por gentileza, escreva o valor do custo de f�brica do carro: ");
		cf = ler.nextFloat();
		ccon = cf+(cf*0.73);
		System.out.println("O custo deste carro para o concumidor ser� igual a: "+ ccon);
		
	}	

}
