package Exercicios_revisao;

import java.util.Scanner;

public class Calculo_imc {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		float peso, altura;
		double imc;
		System.out.println("Por favor, me informa sua altura: ");
		altura = ler.nextFloat();
		System.out.println("Agora, me informa seu peso: ");
		peso = ler.nextFloat();
		imc = peso/(altura*2);
		if (imc<18.5) {
			System.out.println("Sua condição é: abaixo do peso ideal");
		} else if (imc>=18.5 && imc<=25) {
			System.out.println("Sua condição é: peso normal");
		} else if (imc>=25 && imc<=30) {
			System.out.println("Sua condição é: acima do peso");
		} else if (imc>30) {
			System.out.println("Sua condição é: obeso");
		} else {
			System.out.println("Valores inválidos, reinicie com novos valores");
		}
		
		
	}
}
