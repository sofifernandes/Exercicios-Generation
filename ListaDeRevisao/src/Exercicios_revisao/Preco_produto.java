package Exercicios_revisao;

import java.util.Scanner;

public class Preco_produto {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int op_pag;
		float pn;
		double pp;
		 
		 System.out.println("Por gentileza, digite o pre�o que est� na etiqueta do produto: ");
		 pn = ler.nextFloat();
		 System.out.println("Agora, escolha uma op��o de pagamento: \n1- � vistaem dinheiro ou cheque, com desconto.\n2- � vista no cart�o de cr�dito, com desconto.\n3-Em duas vezes, sem juros.\n4-Emtr�s vezes, com juros.");
		 op_pag = ler.nextInt();
		 switch(op_pag) {
		 	case 1:
		 		pp = pn-(pn*0.2);
		 		System.out.println("Voc� ganhou 20% de desconto nessa compra, e o pre�o final a ser pago �: "+pp);
		 		break;
		 	case 2:
		 		pp = pn-(pn*0.15);
		 		System.out.println("Voc� ganhou 15% de desconto nessa compra, e o pre�o final a ser pago �: "+pp);
		 		break;
		 	case 3:
		 		pp = pn/2;
		 		System.out.println("Voc� dividiu sua compra em duas vezes, sem juros, e o pre�o final a ser pago �: "+pp);
		 		break;
		 	case 4:
		 		pp = (pn+pn*0.1)/3;
		 		System.out.println("Voc� dividiu sua compra em duas vezes, com acr�scimo de 10% de juros, e o pre�o final a ser pago �: "+pp);
		 		break;
		 	default:
		 		System.out.println("Op��o inv�lida! Por gentileza, escolha uma op��o dentro das que foram disponibilizadas.");
		 }
			 
	}
}
