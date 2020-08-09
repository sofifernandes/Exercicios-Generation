/*
 Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
 */
programa
{
	funcao inicio()
	{
		inteiro mat[3][3], l, c, soma_mat=0, soma_dia=0

		para (l=0;l<3;l++)
		{
			para(c=0;c<3;c++)
			{
				escreva("Informe um valor: ")
				leia(mat[l][c])
				soma_mat = soma_mat + mat[l][c]
				
			}
			escreva("\n")
			soma_dia = mat[0][0]+mat[1][1]+mat[2][2]// soma diagonal principal
			
		}
		limpa()
		para (l=0;l<3;l++)
		{
			para(c=0;c<3;c++)
			{
				escreva("[",mat[l][c],"]")
				
			}
			escreva("\n")
		}
		escreva("\n\nA soma total dos valores desta matriz é igual a: ", soma_mat)
		escreva("\n\nA soma dos valores da diagonal principal desta matriz é igual a: ", soma_dia, "\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 521; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */