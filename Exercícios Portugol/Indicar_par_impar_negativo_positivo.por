/*
 Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este n�mero � par ou �mpar, 
 e se � positivo ou negativo. 
 */


programa
{
	funcao inicio()
	{
		inteiro num
		escreva("Por favor, digite um n�mero: ")
		leia(num)
		se (num%2 == 0) 
		{
			se (num > 0) {
				escreva("\nSeu valor � par e tamb�m � positivo")	
			}senao {
				escreva("\nSeu valor � par e negativo")
			}
		}
		senao se (num>=0){
			escreva("Seu valor � impar e positivo")
		}senao {
			escreva("Seu valor � impar e negativo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 112; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */