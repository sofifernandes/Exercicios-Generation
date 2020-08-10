package Exercicios_entrega;

import java.util.Scanner;

public class Classificacao_Idade {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.printf("Por gentileza, digite sua idade, apenas em números: ");
		idade = ler.nextInt();
		if (idade>=10 && idade<=14) {
			System.out.printf("Você faz parte do grupo 'Infantil'.");
		}else if (idade>=15 && idade<=17) {
			System.out.printf("Você faz parte do grupo 'Juvenil'.");
		}else if (idade>=18 && idade<=25) {
			System.out.printf("Você faz parte do grupo 'Adulto'.");
		}else {
			System.out.printf("A idade digitada não entra em nenhuma classificação!");
		}
	}
}
