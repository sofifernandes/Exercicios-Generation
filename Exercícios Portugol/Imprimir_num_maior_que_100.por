/*
  Construa um sistema para ler uma vari�vel num�rica N e imprimi-la somente se a mesma for maior que 100, 
 caso contr�rio imprimi-la com o valor zero. 
 */

programa
{
	funcao inicio()
	{
		real N
		escreva("Digite um n�mero: ")
		leia(N)
		limpa()
		se (N>100) {
			escreva("O n�mero digitado � igual a: ", N)
		} senao {
			N = 0
			escreva("O n�mero digitado � igual a: ", N)
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 171; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */