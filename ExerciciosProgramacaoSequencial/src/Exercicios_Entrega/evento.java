package Exercicios_Entrega;

import java.util.Scanner;

public class evento {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int seg, horas, min;
		System.out.println("Por favor, digite a dura��o do evento na sua f�brica em segundos: ");
		seg = ler.nextInt();
		horas = seg/3600;
		min = (seg%3600)/60;
		seg = (seg%3600)%60;
		System.out.println("A dura��o deste evento em horas, minutos e segundos � igual a: "+ horas +" horas, "+ min +" minutos e " + seg + " segundos.");
		
	}
}
