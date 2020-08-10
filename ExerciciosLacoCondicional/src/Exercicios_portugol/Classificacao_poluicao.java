package Exercicios_portugol;

import java.util.Scanner;

public class Classificacao_poluicao {
	  public static void main(String[] args) {
		  
		  @SuppressWarnings("resource")
		  Scanner ler = new Scanner(System.in);  
		  Double ip;
	 
	        System.out.println("Informe o indice de poluição neste momento: ");
	        ip = ler.nextDouble();
	 
	 
	        if (ip > 0.4) {
	            System.out.println("Indústrias do grupo 1,2,3 parem suas atividades!!!");
	        } else {
	            if (ip == 0.4) {
	                System.out.println("Indústrias do grupo 1 e 2 parem suas atividade!!");
	            } else {
	                if (ip >= 0.3) {
	                    System.out.println("Indústrias do grupo 1 parem suas atividade!");
	                } else {
	                    if (ip> 0.25) {
	                        System.out.println("O indice de poluicao está acima do aceitavel.");
	                    } else {
	                        System.out.println("O indice de poluicao está dentro do aceitavel.");
	                    }
	                }
	            }
	 
	        }
	 
	    }
	 
	
  }
