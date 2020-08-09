programa
{
	funcao inicio()
	{
		real a, b, aux
		escreva("Digite um número: ")
		leia(a)
		escreva("\nDigite outro número: ")
		leia(b)
		escreva("\nValor de a, antes da troca, é igual a: ", a, ",e o de b é igual a: ",b)
		aux = a // primeiro vc tem que esvaziar o que tem dentro de a, mas não pode perdê-lo, já que b irá recebê-lo.
		a = b // depois você poderá ´passar o valor de b para a, que ja está vazio
		b = aux // depois, basta pegar o valor de a que vc guardou na auxiliar, a passar para b
		escreva("\nApós trocar os número: a = ",a," e b = ",b)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 548; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */