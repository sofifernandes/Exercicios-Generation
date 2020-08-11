package Exercicios_Portugol;

public class Numero_multiplos {
	public static void main (String args[]) 
	{
		int x, cont1=0, cont2=0, cont3=0, cont4=0;
		for(x=1; x<=100; x++) {
			if (x%2==0) {
				cont1++;
			}
			if (x%3==0) {
				cont2++;
			}
			if (x%5==0) {
				cont3++;
			}
			if (x%2==0 && x%3==0 && x%5==0) {
				cont4++;
			}
		}
		System.out.println("\nA quantidade de números múltiplos de 2 entre 1 e 100 é igual a: "+cont1+ "\n");
		System.out.println("\nA quantidade de números múltiplos de 3 entre 1 e 100 é igual a: "+cont2+"\n");
		System.out.println("\nA quantidade de números múltiplos de 5 entre 1 e 100 é igual a: "+cont3+"\n");
		System.out.println("\nA quantidade de números múltiplos de 2, 3, e 5, ao mesmo tempo, entre 1 e 100, é igual a: "+cont4+"\n");
	}
}
