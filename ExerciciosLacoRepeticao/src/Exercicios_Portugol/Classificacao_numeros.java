package Exercicios_Portugol;

public class Classificacao_numeros {
	public static void main (String args[]) 
	{
		int x;
		
		for(x=1000; x<=1999; x++) {
			if (x%11==5) {
				System.out.println("Valor: "+x);
			}			
		}
			
	}
}
