programa
{
	funcao inicio()
	{
		const inteiro tamanho=3
		inteiro mat[tamanho][2],l,c//linha-coluna
		
		para (l=0;l<tamanho;l++)
		{
			para(c=0;c<2;c++)
			{
				escreva("Valor: ")
				leia(mat[l][c])
			}
		}
		limpa()
		para (l=0;l<tamanho;l++)
		{
			para(c=0;c<2;c++)
			{
				escreva("[",mat[l][c],"]")
				
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 346; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */