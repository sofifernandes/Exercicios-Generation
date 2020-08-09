/*
 Leia uma matriz 10 x 10 e escreva a localização (linha e a coluna) do
maior valor.
 */
programa
{
	funcao inicio()
	{
		inteiro mat[10][10],l=0,c=0, maior=0, maior_l=0, maior_c=0
		
		para (l=0;l<10;l++)
		{
			para(c=0;c<10;c++)
			{
				escreva("Valor: ")
				leia(mat[l][c])
				se (mat[l][c]>maior){
				maior = mat[l][c] 
				maior_l = l
				maior_c = c
				}				
			}
		}	
		limpa()
		para (l=0;l<10;l++)
		{
			para(c=0;c<10;c++)
			{
				escreva("[",mat[l][c],"]")								
			}
			escreva("\n")
		}				
		escreva("\nMaior elemento: ", maior)
		escreva("\nO maior valor desta matriz está localizado  na linha ", maior_l, " e na coluna ", maior_c, ".")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 86; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */