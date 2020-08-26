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
		 
		 System.out.println("Por gentileza, digite o preço que está na etiqueta do produto: ");
		 pn = ler.nextFloat();
		 System.out.println("Agora, escolha uma opção de pagamento: \n1- À vistaem dinheiro ou cheque, com desconto.\n2- À vista no cartão de crédito, com desconto.\n3-Em duas vezes, sem juros.\n4-Emtrês vezes, com juros.");
		 op_pag = ler.nextInt();
		 switch(op_pag) {
		 	case 1:
		 		pp = pn-(pn*0.2);
		 		System.out.println("Você ganhou 20% de desconto nessa compra, e o preço final a ser pago é: "+pp);
		 		break;
		 	case 2:
		 		pp = pn-(pn*0.15);
		 		System.out.println("Você ganhou 15% de desconto nessa compra, e o preço final a ser pago é: "+pp);
		 		break;
		 	case 3:
		 		pp = pn/2;
		 		System.out.println("Você dividiu sua compra em duas vezes, sem juros, e o preço final a ser pago é: "+pp);
		 		break;
		 	case 4:
		 		pp = (pn+pn*0.1)/3;
		 		System.out.println("Você dividiu sua compra em duas vezes, com acréscimo de 10% de juros, e o preço final a ser pago é: "+pp);
		 		break;
		 	default:
		 		System.out.println("Opção inválida! Por gentileza, escolha uma opção dentro das que foram disponibilizadas.");
		 }
			 
	}
}
