/*
 Desenvolva um sistema em que: 

???Leia 4 (quatro) n�meros; 

???Calcule o quadrado de cada um; 

???Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize; 

???Caso contr�rio, imprima os valores lidos e seus respectivos quadrados. 
 */

programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	 	inteiro n1, n2, n3, n4, res1, res2, res3, res4
	 	escreva("Por favor, digite o primeiro n�mero: ")
	 	leia(n1)
	 	escreva("Por favor, digite o segundo n�mero: ")
	 	leia(n2)
	 	escreva("Por favor, digite o terceiro n�mero: ")
	 	leia(n3)
	 	escreva("Por favor, digite o quarto n�mero: ")
	 	leia(n4)
	 	limpa()
	 	res1 = mat.potencia(n1, 2)
	 	res2 = mat.potencia(n2, 2)
	 	res3 = mat.potencia(n3, 2)
	 	res4 = mat.potencia(n4, 2)
	 	se (res3 >=1000) {
	 		escreva("O quadrado do n�mero 3 � igual a: ", res3)
	 	} senao {
	 		escreva("Os quadrados dos n�meros digitados s�o: ", "\nN�mero 1: ",n1, " \nSeu valor ao quadrado: ", res1,"\nN�mero 2: ",n2, " \nSeu valor ao quadrado: ", res2,"\nN�mero 3: ",n3, " \nSeu valor ao quadrado: ", res3,"\nN�mero 4: ",n4, " \nSeu valor ao quadrado: ", res4) 
	 	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1134; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */