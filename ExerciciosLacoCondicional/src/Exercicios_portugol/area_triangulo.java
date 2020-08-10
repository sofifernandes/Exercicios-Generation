package Exercicios_portugol;

import java.util.Scanner;

public class area_triangulo {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		float altura, base, area;
		System.out.printf("Por favor, indique o tamanho da base do triângulo: ");
		base = ler.nextFloat();
		System.out.printf("Por favor, agora me informe a altura do triângulo: ");
		altura = ler.nextFloat();
		if (base>0 && altura>0) 
		{
			area= (base*altura)/2;
			System.out.printf("A área do triângulo é igual a: "+area);
		}else {
			System.out.printf("Com os valores informados,não é possível calcular a área do triângulo. ");
		}
			
	}
}
