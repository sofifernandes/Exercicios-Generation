/*
 Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos (positivos maiores que zero). 
 Em caso afirmativo, calcular a �rea do tri�ngulo. 
 */


programa
{
	funcao inicio()
	{
		real altura, base, area
		escreva("Por favor, indique o tamanho da base do tri�ngulo: ")
		leia(base)
		escreva("Por favor, agora me informe a altura do tri�ngulo: ")
		leia(altura)
		se (base>0 e altura>0){
			area = (base*altura)/2
			escreva("A �rea do tri�ngulo � igual a: ", area)			
		}senao {
			escreva("Com os valores informados, n�o � poss�vel calcular a �rea do tri�ngulo.")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 325; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */