package Exercicios_Portugol;

import java.util.Scanner;

public class Leitura_numeros {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		String nome;
		int cont=0;
		float num, soma_num=0, media;
		System.out.printf("Por gentileza, me informe seu nome: ");
		nome = ler.nextLine();
		System.out.printf(nome+", digite 1 para inicializar: ");
		num = ler.nextFloat();
		while (num >0) {
			System.out.printf("Digite um número: ");
			num = ler.nextFloat();
			soma_num = soma_num + num;
			cont = cont+1;					
		}
		media = soma_num/cont;
		System.out.printf("O total do somatório dos números digitados é igual a: "+soma_num);
		System.out.printf("\nA média desses números é igual a: "+ media);
		System.out.printf("\nPor fim, o total de valores lidos é igual a: "+ cont);
		
	}
}
