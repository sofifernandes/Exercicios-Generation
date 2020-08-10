package Exercicios_portugol;

import java.util.*;

public class Salario {
	public static void main (String args[]) 
	{
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		String nome;
		double E, st, sal_exc;
		int C, N;
		System.out.println("Por favor, digite seu nome: ");
		nome = ler.nextLine();
		System.out.println(nome+", por gentileza, agora informe quantas horas você trabalhou: ");
		N = ler.nextInt();
		System.out.println("Por fim, informe o seu código: ");
		C = ler.nextInt();
		if (N<=50) {
			st = N*10;
			sal_exc=0;
			
		}else {
			E=N-50;
			sal_exc = E*20;
			st= sal_exc + 500;
		}
		System.out.printf("Nome: "+nome);
		System.out.printf("\nCódigo do operário: "+C);
		System.out.printf("\nExcesso: "+sal_exc);
		System.out.printf("\nSalário total a ser recebido: "+st);
					
		
	}
}
