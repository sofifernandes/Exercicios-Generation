package Exercicios_revisao;

import java.util.Scanner;

public class Intervalo_numeros {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		int cont1=0, cont2=0, cont3=0, cont4=0;
		float num=1;
		
		while(num>0) {
			System.out.println("Escreva um n�mero: ");
			num = ler.nextFloat();
			if (num>=0 && num<=25) {
				cont1++;
			}
			if (num>=26 && num<=50) {
				cont2++;
			}
			if (num>=51 && num<=75) {
				cont3++;
			}
			if (num>=76 && num<=100) {
				cont4++;
			}
		}
		System.out.println("Entre os n�mero digitaos, h� "+cont1+" n�mero no intervalo de [0-25]");
		System.out.println("Entre os n�mero digitaos, h� "+cont2+" n�mero no intervalo de [26-50]");
		System.out.println("Entre os n�mero digitaos, h� "+cont3+" n�mero no intervalo de [51-75]");
		System.out.println("Entre os n�mero digitaos, h� "+cont4+" n�mero no intervalo de [76-100]");
	}
}
