programa
{
	funcao inicio()
	{
		inteiro numero[4],x

		para (x=0;x<4;x++)//popular o vetor
		{
			escreva("Entre com um n�mero: ")
			leia(numero[x])		
		}
		para (x=0;x<4;x++)
		{
			escreva("\nValor Posi��o ",x+1,":", numero[x])
		}
		para (x=3;x>=0;x--)//para mostrar de forma decrescente
		{
			escreva("\nPosi��o decrescente ",x+1,":", numero[x])
		}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */