/*
Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os
n�meros de 1 at� ele. Ex.: o usu�rio entra 7, o programa vai
mostrar 28, pois 1+2+3+4+5+6+7=28.
 */
programa
{
	funcao inicio()
	{
		inteiro num, soma_num=0
		escreva("Por gentileza, digite um n�mero: ")
		leia(num)
		faca {
			soma_num = soma_num+num
			num--
					
		}enquanto (num>=0)
			escreva("\nA soma dos n�meros at� o n�mero digitado � igual a: ", soma_num, "\n")			
	 }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 461; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */