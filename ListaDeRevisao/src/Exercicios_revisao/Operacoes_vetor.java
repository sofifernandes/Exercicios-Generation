package Exercicios_revisao;

import java.util.Scanner;

public class Operacoes_vetor {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		float[] vetor = new float[5];
		int cod;
		
		for(int i=0; i<5; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = entrada.nextFloat();
		}
		
		System.out.println("Escolha entre as opções abaixo, o que gostaria de fazer com esse vetor: \n0- Finalizar o programa\n1- Mostrar o veotr na ordem direta\n2- Mostrar o vetor na ordem inversa");
		cod = ler.nextInt();
		
		switch (cod) {
			case 0:
				System.out.println("Programa finalizado.");
				break;
			case 1:
				for(int i=0; i<5;i++) {
					System.out.println("Valor "+i+"="+vetor[i]);
				}
				break;
			case 2:
				for(int i= (vetor.length - 1); i>-1;i--) {
					System.out.println("Valor "+i+"="+vetor[i]);
			}
				break;
			default:
				System.out.println("Código inválido! Tente novamente.");
		}
		
		
		
	}
}
