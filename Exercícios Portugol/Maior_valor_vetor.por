/*
 Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
 */
programa
{
	funcao inicio()
	{
		inteiro numero[5],x, maior=0

		para (x=0;x<5;x++)//popular o vetor
		{
			escreva("Entre com um n�mero: ")
			leia(numero[x])
			se (numero[x]>maior){
				maior = numero[x]
			}					   		 		
		}
		limpa()
		para (x=0;x<5;x++)
		{
			escreva("\nValor Posi��o ",x,":", numero[x])
					
		}		
		escreva("\n\nA maior pontua��o entre os n�meros apresentados �: ", maior, "\n")	
					
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 165; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */