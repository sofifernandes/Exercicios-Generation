package Exercicios_Portugol;

public class Classificacao_numero_1 {
	public static void main (String args[]) 
	{
		int num, soma_num=0;
		for (num=1; num<=50; num++) {
			if (num%2==0 && num%3==0) {
				soma_num = soma_num + num;
			}
		}
		System.out.printf("A soma dos n�meros �mpares e m�ltiplos de tr�s dentro do conjunto de n�meros de 1 at� 500 � igual a:  "+ soma_num);
	}
		
}
