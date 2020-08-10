package Exercicios_Portugol;

import java.util.*;

public class distancia_pontos_cartesianos {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int x1, x2, y1, y2, d, aux1, aux2;
		System.out.println("Por favor, digite um valor para x do seu primeiro ponto no plano: ");
		x1 = ler.nextInt();
		System.out.println("Digite um valor para y do seu primeiro ponto no plano: ");
		y1 = ler.nextInt();
		System.out.println("Agora, digite um valor para x do seu segundo ponto no plano: ");
		x2 = ler.nextInt();
		System.out.println("Digite um valor para y do seu segundo ponto no plano: ");
		y2 = ler.nextInt();
		aux1 = (int) Math.pow((x2-x1), 2);
		aux2 = (int) Math.pow((y2-y1), 2);
		d = (int) Math.sqrt((aux1+aux2));
		System.out.println("A distância entre os pontos citados no plano é igual a: "+d);
	}
			
}
