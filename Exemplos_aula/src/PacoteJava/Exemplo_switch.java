package PacoteJava;

import java.util.Scanner;

public class Exemplo_switch {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		int a, b, resultado=0, op;
		
		System.out.println("Entre com o valor de A: ");
		a = ler.nextInt();
		System.out.println("Entre com o valor de B: ");
		b = ler.nextInt();
		
		System.out.println("\n1--Soma\n2--Diferen�a\n3--Multiplica��o\n4--Divis�o");
		
		System.out.println("Entre com a sua op��o: ");
		op = ler.nextInt();
		
		switch(op) {
		case 1:
			resultado = a+b;
			break;
		case 2:
			resultado = a-b;
			break;
		case 3:
			resultado = a*b;
			break;
		case 4:
			resultado = a/b;
			break;
		default:
			System.out.println("Op��o inv�lida..");
		}
		
		System.out.println("O resultado foi de: "+resultado);
		
	}
}
