programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro contador = 10

		enquanto (contador>0) {
			limpa()
			escreva("Contagem regressiva... ", contador)
			contador = contador-1
			Util.aguarde(1000)			
		}
		limpa()
		escreva("Booooom....")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 207; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */