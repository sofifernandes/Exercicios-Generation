/* 
 Leia um vetor de 40 posições e atribua valor 0 para todos os
elementos que possuírem valores negativos.
 */

programa
{
	funcao inicio()
	{
		
		inteiro numero[40],x, cont=0

		para (x=0;x<40;x++)//popular o vetor
		{
			escreva("Entre com um número: ")
			leia(numero[x])
			
		}
		limpa()
		para (x=0;x<40;x++)
		{
			se (numero[x]<0){
				numero[x]=0
			}
			escreva("\nValor Posição ",x,":", numero[x])
		}
				
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 423; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */