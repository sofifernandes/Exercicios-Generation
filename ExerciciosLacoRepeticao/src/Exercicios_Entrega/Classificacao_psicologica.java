package Exercicios_Entrega;

import java.util.Scanner;

public class Classificacao_psicologica {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int np=0, idade, sexo, psico, cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0;
		while(np<150) {
			System.out.println("Por gentileza, me informe sua vez aqui (ex: 1=primeiro a fazer o teste... até 150): ");
			np = ler.nextInt();
			System.out.println("Por gentileza, me informe sua idade: ");
			idade = ler.nextInt();
			System.out.println("Por gentileza,agora me informe qual seu sexo (menu abaixo com as opções): \n1-Feminino\n2-Masculino\n3-Outros");
			sexo = ler.nextInt();
			System.out.println("Por fim, me informe seu estado (menu abaixo com as opções): \n1-Se você é calmo(a)\n2-Se você é nervoso(a)\n3-Se você é agressivo(a)");
			psico = ler.nextInt();
			if (psico==1) {
				cont1++;
			}
			if(sexo==1 && psico==2) {
				cont2++;
			}
			if (sexo==2 && psico==3) {
				cont3++;
			}
			if (sexo==3 && psico==1) {
				cont4++;
			}
			if (idade>40 && psico==2) {
				cont5++;
			}
			if (idade<18 && psico==1) {
				cont6++;
			}
			
		}
		System.out.println("O número de pessoas calmas é igual a: "+cont1);
		System.out.println("O número de mulheres nervosas é igual a: "+cont2);
		System.out.println("O número de homens agrassivos é igual a: "+cont3);
		System.out.println("O número de outros calmos é igual a: "+cont4);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é igual a: "+cont5);
		System.out.println("O número de pessoas calmas com menos de 18 anos é igual a: "+cont6);
		
	}
}
