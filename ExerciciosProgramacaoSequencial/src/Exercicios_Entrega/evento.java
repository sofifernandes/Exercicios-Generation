package Exercicios_Entrega;

import java.util.Scanner;

public class evento {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int seg, horas, min;
		System.out.println("Por favor, digite a duração do evento na sua fábrica em segundos: ");
		seg = ler.nextInt();
		horas = seg/3600;
		min = (seg%3600)/60;
		seg = (seg%3600)%60;
		System.out.println("A duração deste evento em horas, minutos e segundos é igual a: "+ horas +" horas, "+ min +" minutos e " + seg + " segundos.");
		
	}
}
