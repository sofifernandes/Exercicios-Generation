/*
 Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e
apresente no final o total do somat�rio, a m�dia e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usu�rio fornecer um valor
negativo.
 */

programa
{
	funcao inicio()
	{
		inteiro cont=0
		real num, soma_num=0, media
		cadeia nome	
		escreva("Por favor, me informe seu nome: ")
		leia(nome)
		escreva(nome + ", digite um n�mero para inicializar: ")
	 	leia(num)
		enquanto (num > 0){
	  		escreva("Digite um n�mero: ")
	  		leia(num)
	  		soma_num = soma_num + num
	  		cont = cont+1
	  		
	  		  	  	
	  	}
	  	media = soma_num/cont
	  	escreva("O total do somat�rio dos n�meros digitados � igual a: ", soma_num)
	  	escreva("\nA m�dia desses n�meros � igual a: ", media)
	  	escreva("\nPor fim, o total de valores lidos � igual a: ", cont)
	  		  
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 334; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */