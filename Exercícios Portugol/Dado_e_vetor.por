/*
 Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.
 */
programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	   inteiro dado[10],x, soma_num=0, cont=0
	   real media=0.0

	   para (x=0;x<10;x++)
	   {
	   	   escreva("Insira um valor correspondente ao que apareceu ao lan�ar o dado: ")
	   	   leia(dado[x])
	   	   se (dado[x]==6){
			cont++
		   }
		   soma_num = soma_num + dado[x]   	    
	   	      	      	   	   	   
	   }
	   limpa()
	   para (x=0;x<10;x++)
		{
			escreva("\nValor Posi��o ",x+1,":", dado[x])
		}
		media = soma_num/10
		escreva("\n\nA m�dia aritm�tica entre os n�meros de lan�amento � igual a: ", mat.arredondar(media,2))
		escreva("\n\nO n�mero de ocorr�ncias da maior pontua��o � igual a: ", cont, "\n\n")
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 286; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */