/*
  João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um diagrama de blocos que leia a variável P (peso de peixes) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. Caso 
 contrário mostrar tais variáveis com o conteúdo ZERO. 
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
			escreva("O peso excedeu em ", E," quilos, e o valor a ser pago na multa é de: ", m)
		 
		} senao {
			E=0
			m=0
			escreva("O peso não excedeu de acordo com o regulamento, sendo assim, o excesso tem valor de: ", E, ", e a multa tem valor de ", m)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 5; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */