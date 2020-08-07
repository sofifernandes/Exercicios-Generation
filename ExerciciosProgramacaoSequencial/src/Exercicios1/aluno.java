package Exercicios1;

import java.util.Scanner;

public class aluno {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		float nota1, nota2, nota3, mp;
		System.out.println("Por gentileza, a primeira nota: ");
		nota1 = ler.nextInt();
		System.out.println("Agora, digite a segunda nota: ");
		nota2 = ler.nextInt();
		System.out.println("Por fim, digite a terceira nota: ");
		nota3 = ler.nextInt();
		mp = (nota1*2+nota2*3+nota3*5)/10;
		System.out.println("Após a execução dos cáculos de média, a nota final é igual a: "+ mp);
	}
	
}

