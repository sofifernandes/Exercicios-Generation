/*
 Faça um programa que carregue uma matriz 2 x 2, calcule e mostre
uma matriz resultante que será a matriz digitada multiplica pelo
maior elemento da matriz.
 */

programa
{
	funcao inicio()
	{
		inteiro mat[2][2],l=0,c=0,M1[2][2], maior=0
		
		para (l=0;l<2;l++)
		{
			para(c=0;c<2;c++)
			{
				escreva("Valor: ")
				leia(mat[l][c])
				se (mat[l][c]>maior){
				maior = mat[l][c]
				}				
			}
		}
		limpa()
		para (l=0;l<2;l++)
		{
			para(c=0;c<2;c++)
			{
				escreva("[",mat[l][c],"]")								
			}
			escreva("\n")
		}
		escreva("\n")				
		para (l=0;l<2;l++)
		{
			para(c=0;c<2;c++)
			{
				
				M1[l][c]= mat[l][c]*maior
				
					
			}			
		}
		para (l=0;l<2;l++)
		{
			para(c=0;c<2;c++)
			{
				escreva("[",M1[l][c],"]")								
			}
			escreva("\n")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 159; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */