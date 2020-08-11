package Exercicios_Portugol;

public class Contagem_numeros {
	public static void main (String args[]) 
	{
		int num=233;
		do {
			if(num>=300 && num<=400) {
				num = num+3;
			}else {
				num = num+5;
			}
			System.out.println("\nValor: "+ num);
		}while (num<=456);
			
	}
}
