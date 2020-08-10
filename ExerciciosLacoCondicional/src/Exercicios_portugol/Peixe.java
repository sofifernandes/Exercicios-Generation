package Exercicios_portugol;

import java.util.Scanner;

public class Peixe {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		float p, e, m;
		System.out.println("Por favor, digite o peso de peixes que trouxe: ");
		p = ler.nextFloat();
		if (p>50) 
		{
			e = p-50;
			m = e*4;
			System.out.println("O peso do peixe excedeu em "+e+" quilos, e o valor a ser pago na multa é de: "+m);
		}else 
		{
			e=0;
			m=0;
			System.out.println("O peso não excedeu de acordo com o regulamento, sendo assim, o excesso tem valor de: "+e+", e a multa tem valor de: "+m);
		}
		
	}

}
