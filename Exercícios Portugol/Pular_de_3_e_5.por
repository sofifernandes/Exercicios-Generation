/*
 Fa�a um programa que mostre uma contagem na tela de 233 a 456, s� que
contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando n�o estiver.
*/

programa
{
	funcao inicio()
	{
		inteiro num=233
		faca
		{
			se (num>=300 e num<=400){
			    num = num + 3
			  			    
			}senao{
			    num = num + 5
			}
			escreva("\nValor: ", num)
		}enquanto (num<=456)
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */