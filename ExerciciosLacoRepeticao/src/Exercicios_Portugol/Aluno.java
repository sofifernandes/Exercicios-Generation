package Exercicios_Portugol;

import java.util.Scanner;

public class Aluno {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int na=0;
		float nota1, nota2, mp;
		String nome;
		while (na<5) {
			System.out.println("\nDigite seu nome, por gentileza: ");
			nome = ler.nextLine();
			System.out.println("\nDigite a primeira nota: ");
			nota1 = ler.nextFloat();
			while (nota1>10 || nota1<0) {
				System.out.println("\nDigite a primeira nota novamente: ");
				nota1 = ler.nextFloat();
			}
			System.out.println("\nDigite a segunda nota: ");
			nota2 = ler.nextFloat();
			while (nota2>10 || nota2<0) {
				System.out.println("\nDigite a segunda nota novamente: ");
				nota2 = ler.nextFloat();
			}
			mp = (nota1*1)+(nota2*2)/3;
			System.out.println("Aluno: "+nome);
			System.out.println("\nMédia ponderada deste aluno: "+mp);
			
		}		
	}
}
