/*
 Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o
m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500.
 */
programa
{
	funcao inicio()
	{
		inteiro num, soma_num=0
		para (num=1; num<=500; num++){
			se(num % 2!=0 e num%3==0){
					soma_num = soma_num+num
			}
		}
		escreva("A soma dos n�meros �mpares e m�ltiplos de tr�s dentro do conjunto de n�meros de 1 at� 500 � igual a:  ", soma_num)
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 155; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */