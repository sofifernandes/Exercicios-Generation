programa
{
	funcao inicio()
	{
		real a, b, aux
		escreva("Digite um n�mero: ")
		leia(a)
		escreva("\nDigite outro n�mero: ")
		leia(b)
		escreva("\nValor de a, antes da troca, � igual a: ", a, ",e o de b � igual a: ",b)
		aux = a // primeiro vc tem que esvaziar o que tem dentro de a, mas n�o pode perd�-lo, j� que b ir� receb�-lo.
		a = b // depois voc� poder� �passar o valor de b para a, que ja est� vazio
		b = aux // depois, basta pegar o valor de a que vc guardou na auxiliar, a passar para b
		escreva("\nAp�s trocar os n�mero: a = ",a," e b = ",b)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 548; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */