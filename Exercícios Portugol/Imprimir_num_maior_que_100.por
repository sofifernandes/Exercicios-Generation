/*
  Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100, 
 caso contrário imprimi-la com o valor zero. 
 */

programa
{
	funcao inicio()
	{
		real N
		escreva("Digite um número: ")
		leia(N)
		limpa()
		se (N>100) {
			escreva("O número digitado é igual a: ", N)
		} senao {
			N = 0
			escreva("O número digitado é igual a: ", N)
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 171; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */