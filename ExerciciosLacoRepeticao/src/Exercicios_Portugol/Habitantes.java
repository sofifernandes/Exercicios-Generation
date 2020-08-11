package Exercicios_Portugol;

import java.util.Scanner;

public class Habitantes {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int nh, nf;
		float sal, media_sal, media_nf, perc=0, maior_sal=0, y=0, soma_sal=0, soma_nf=0;
		for (nh=1; nh<=5; nh++) {
			System.out.printf("Por favor, informe seu salário: ");
			sal = ler.nextFloat();
			System.out.printf("Agora, nos informe quantos filhos você tem: ");
			nf = ler.nextInt();
			soma_sal = soma_sal + sal;
			soma_nf = soma_nf+nf;
			if(sal<=100) {
				y++;
			}if (maior_sal<sal) {
				maior_sal = sal;
			}
			
		}
		perc = (y*100)/5;
		media_sal = soma_sal/5;
		media_nf =  soma_nf/5;
		System.out.printf("A média salarial entre os entrevistados é igual a: "+ media_sal);
		System.out.printf("\nA média de filhos entre esses habitantes é igual a: "+ media_nf);
		System.out.printf("\nO percentual de pessoas com salários até R$100,00 é igual a:  "+ perc);
		System.out.printf("\nPor fim, o maior salário entre os indicados é igual a: "+ maior_sal);
		
		
		

	}
}
