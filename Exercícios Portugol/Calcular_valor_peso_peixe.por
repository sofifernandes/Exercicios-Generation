/*
  Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um diagrama de blocos que leia a vari�vel P (peso de peixes) e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o dever� pagar. Caso 
 contr�rio mostrar tais vari�veis com o conte�do ZERO. 
 */

programa
{
	funcao inicio()
	{
		real p, E, m
		escreva("Por favor, digite o peso de peixes que trouxe: ")
		leia(p)
		limpa()
		se (p > 50) {
			E = p-50
			m = E*4
			escreva("O peso excedeu em ", E," quilos, e o valor a ser pago na multa � de: ", m)
		 
		} senao {
			E=0
			m=0
			escreva("O peso n�o excedeu de acordo com o regulamento, sendo assim, o excesso tem valor de: ", E, ", e a multa tem valor de ", m)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 5; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */