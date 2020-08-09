programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		inteiro num1,num2,num3
		real mp, raiz, potencia // criação da média ponderada
		escreva("Entre com o primeiro número: ")//comando para saída, impressão na tela
		leia(num1)
		escreva("\nEntre com o segundo número: ")
		leia(num2)
		escreva("\nEntre com o terceiro número: ")
		leia(num3)
		mp = (num1*3+num2*3+num3*4)/10
		escreva("\nA média ponderada é igual a: ", mp)
		raiz = mat.raiz(num1,3.0)
		potencia = mat.potencia(num2, 4.0)
		escreva("\nRaiz quadrada do primeiro número é igual a: ", raiz)
		escreva("\nPotencia do segundo numero: ",potencia)			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 503; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */