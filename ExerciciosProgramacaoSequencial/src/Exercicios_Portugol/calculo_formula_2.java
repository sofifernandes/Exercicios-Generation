package Exercicios_Portugol;

import java.util.Scanner;

public class calculo_formula_2 {
	public static void main (String args[]) 
	{
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		System.out.println("Por favor, digite um número para a: ");
		a = ler.nextDouble();
		System.out.println("Por favor, digite um número para b: ");
		b = ler.nextDouble();
		System.out.println("Por favor, digite um número para c: ");
		c = ler.nextDouble();
		System.out.println("Por favor, digite um número para d: ");
		d = ler.nextDouble();
		System.out.println("Por favor, digite um número para e: ");
		e = ler.nextDouble();
		System.out.println("Por favor, digite um número para f: ");
		f = ler.nextDouble();
		x = (c*e - b*f)/(a*e - b*d);
		y = (a*f - c*d)/(a*e - b*d);
		System.out.println("Os valores de x e y, respectivamente, são: "+ x +" e "+ y +".");
	}
}
