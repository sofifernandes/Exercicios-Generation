package Lista_completa_java;

public class Operacoes_vetor_1 {
	public static void main (String args[])
	{
		
		int[] A = {1,0,5,-2,-5,7};
		int soma_num=0;
		
		soma_num = A[0]+A[1]+A[5];
		A[4] = 100;
		System.out.println("Vetor A: ");
		for(int i=0; i<6;i++) {
			System.out.println("Posição "+i+" = "+A[i]);
		}
		System.out.println("\nO valor da soma dos números do vetor é igual a: "+soma_num);
		
	}
}
