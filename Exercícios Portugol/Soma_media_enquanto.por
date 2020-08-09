/*
 Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
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
		escreva(nome + ", digite um número para inicializar: ")
	 	leia(num)
		enquanto (num > 0){
	  		escreva("Digite um número: ")
	  		leia(num)
	  		soma_num = soma_num + num
	  		cont = cont+1
	  		
	  		  	  	
	  	}
	  	media = soma_num/cont
	  	escreva("O total do somatório dos números digitados é igual a: ", soma_num)
	  	escreva("\nA média desses números é igual a: ", media)
	  	escreva("\nPor fim, o total de valores lidos é igual a: ", cont)
	  		  
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 334; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */