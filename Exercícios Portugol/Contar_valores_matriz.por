/*
 Leia uma matriz 6 x 6, conte e escreva quantos valores maiores que
10 ela possui.
 */

programa
{
	funcao inicio()
	{
		inteiro mat[6][6],l=0,c=0, cont=0, num=0
		
		para (l=0;l<6;l++)
		{
			para(c=0;c<6;c++)
			{
				escreva("Valor: ")
				leia(mat[l][c])
				se (mat[l][c]>10){
					cont++
			     }
							
			}
		}
		limpa()
		para (l=0;l<6;l++)
		{
			para(c=0;c<6;c++)
			{
				escreva("[",mat[l][c],"]")								
			}
			escreva("\n")
		}				
						
		escreva("\nA quantidade de valores maiores que 10 nesta matriz é igual a: ", cont, "\n")
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 85; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */