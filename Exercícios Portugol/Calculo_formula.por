/*
 Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e 
 calcule a seguinte express�o: 
 d=(r+s)/2, onde r=(a+b)^2 e s=(b+c)^2 
 */

programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	  inteiro a, b, c, r, s
	  real d
	  escreva("Por favor, digite um n�mero: ")
	  leia(a)
	  escreva("Por favor, digite o segundo n�mero: ")
	  leia(b)
	  escreva("Por fim, digite o terceiro n�mero: ")
	  leia(c)
	  r = mat.potencia((a+b),2)
	  s = mat.potencia((b+c),2)
	  d = (r+s)/2
	  escreva("O valor de D, ao final do c�lculo, � igual a: ", d)
	    
	  	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 150; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */