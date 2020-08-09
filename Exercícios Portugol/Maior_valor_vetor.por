/*
 Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
 */
programa
{
	funcao inicio()
	{
		inteiro numero[5],x, maior=0

		para (x=0;x<5;x++)//popular o vetor
		{
			escreva("Entre com um número: ")
			leia(numero[x])
			se (numero[x]>maior){
				maior = numero[x]
			}					   		 		
		}
		limpa()
		para (x=0;x<5;x++)
		{
			escreva("\nValor Posição ",x,":", numero[x])
					
		}		
		escreva("\n\nA maior pontuação entre os números apresentados é: ", maior, "\n")	
					
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 165; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */