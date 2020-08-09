/*
 Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, 
 e se é positivo ou negativo. 
 */


programa
{
	funcao inicio()
	{
		inteiro num
		escreva("Por favor, digite um número: ")
		leia(num)
		se (num%2 == 0) 
		{
			se (num > 0) {
				escreva("\nSeu valor é par e também é positivo")	
			}senao {
				escreva("\nSeu valor é par e negativo")
			}
		}
		senao se (num>=0){
			escreva("Seu valor é impar e positivo")
		}senao {
			escreva("Seu valor é impar e negativo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 112; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */