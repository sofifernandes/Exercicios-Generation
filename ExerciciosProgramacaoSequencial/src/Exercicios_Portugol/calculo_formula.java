package Exercicios_Portugol;

import java.util.*;

public class calculo_formula {
	public static void main (String args[]) 
	{
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		double d, r, s;
		System.out.println("Por favor, digite o primeiro número: ");
		a = ler.nextInt();
		System.out.println("Agora, digite o segundo número: ");
		b = ler.nextInt();
		System.out.println("Por fim, digite o terceiro número: ");
		c = ler.nextInt();
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = (r+s)/2;
		System.out.println("O valor de D, ao final do cálculo, é igual a: "+d);
		
		
	}
}
