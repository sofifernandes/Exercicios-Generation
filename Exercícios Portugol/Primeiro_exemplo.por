programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		inteiro num1,num2,num3
		real mp, raiz, potencia // cria��o da m�dia ponderada
		escreva("Entre com o primeiro n�mero: ")//comando para sa�da, impress�o na tela
		leia(num1)
		escreva("\nEntre com o segundo n�mero: ")
		leia(num2)
		escreva("\nEntre com o terceiro n�mero: ")
		leia(num3)
		mp = (num1*3+num2*3+num3*4)/10
		escreva("\nA m�dia ponderada � igual a: ", mp)
		raiz = mat.raiz(num1,3.0)
		potencia = mat.potencia(num2, 4.0)
		escreva("\nRaiz quadrada do primeiro n�mero � igual a: ", raiz)
		escreva("\nPotencia do segundo numero: ",potencia)			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 503; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */