package Exercicios_revisao;

public class Calculo_numeros {
	public static void main (String args[])
	{
			
		int numerador = -1;
		float resposta = 0;
		
		for (int denominador = 1; denominador <= 50; denominador++){
		    numerador = numerador + 2;
		    resposta = resposta + (numerador / denominador);
		}
		System.out.println("A resposta para essa soma é igual a: "+resposta);
	}
}
