/* 
 Leia um vetor de 40 posi��es e atribua valor 0 para todos os
elementos que possu�rem valores negativos.
 */

programa
{
	funcao inicio()
	{
		
		inteiro numero[40],x, cont=0

		para (x=0;x<40;x++)//popular o vetor
		{
			escreva("Entre com um n�mero: ")
			leia(numero[x])
			
		}
		limpa()
		para (x=0;x<40;x++)
		{
			se (numero[x]<0){
				numero[x]=0
			}
			escreva("\nValor Posi��o ",x,":", numero[x])
		}
				
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 423; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */