package Exercicios_portugol;

import java.util.Scanner;

public class Classificacao_idade {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.printf("Por gentileza, digite sua idade, apenas em n�meros: ");
		idade = ler.nextInt();
		if (idade>=5 && idade<=7) {
			System.out.printf("Voc� faz parte do grupo 'Infantil A'.");
		}else if (idade>=8 && idade<=11) {
			System.out.printf("Voc� faz parte do grupo 'Infantil B'.");
		}else if (idade>=12 && idade<=13) {
			System.out.printf("Voc� faz parte do grupo 'Juvenil A'.");
		}else if (idade>=14 && idade<=17) {
			System.out.printf("Voc� faz parte do grupo 'Juvenil B'.");
		}else if (idade>=18) {
			System.out.printf("Voc� faz parte do grupo 'Adulto'.");
		}else {
			System.out.printf("A idade digitada n�o entra em nenhuma classifica��o!");
		}
	}
}

