/*
 Escreve um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma
posi��o das matrizes N1 e N2.
 */
programa
{
	funcao inicio()
	{
		inteiro N1[4][6],N2[4][6], M1[4][6], M2[4][6], l=0, c=0

		para (l=0;l<4;l++)
		{
			para(c=0;c<6;c++)
			{
				escreva("Informe um valor: ")
				leia(N1[l][c])
						
			}
		}
		escreva("\n\n")
		para (l=0;l<4;l++)
		{
			para(c=0;c<6;c++)
			{
				escreva("Informe um valor: ")
				leia(N2[l][c])
						
			}
		}
		limpa()	
		para (l=0;l<4;l++)
		{
			para(c=0;c<6;c++)
			{
				
				M1[l][c]= N1[l][c] + N2[l][c]
				
					
			}			
		}
		para (l=0;l<4;l++)
		{
			para(c=0;c<6;c++)
			{
				
				M2[l][c]= N1[l][c] - N2[l][c]
				
					
			}			
		}
		escreva("O resultado da soma das matrizes N1 e N2 est� representada atrav�s da matriz M1 abaixo: \n")
		escreva("\n")
		para (l=0;l<4;l++)
		{
			para(c=0;c<6;c++)
			{
				escreva("[",M1[l][c],"]")
				
			}
			escreva("\n")
		}
		escreva("\n")
		escreva("\nE o resultado da subtra��o das matrizes N1 e N2 est� representada atrav�s da matriz M2 abaixo: \n")
		escreva("\n")
		para (l=0;l<4;l++)
		{
			para(c=0;c<6;c++)
			{
				escreva("[",M2[l][c],"]")
				
			}
			escreva("\n")
		}
		escreva("\n")		
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 278; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */