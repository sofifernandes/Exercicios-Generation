package Exercicios_Entrega;

import java.util.Scanner;

public class Classificacao_numeros_par_impar {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int x, num, cont1=0, cont2=0;
		for (x=1; x<=10; x++) {
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			if (num%2==0) {
				cont1++;
			}else {
				cont2++;
			}
		}
		System.out.println("O total de número pares entre os números informados é igual a: "+ cont1);
		System.out.println("O total de número ímpares entre os números informados é igual a: "+ cont2);
	}
}
