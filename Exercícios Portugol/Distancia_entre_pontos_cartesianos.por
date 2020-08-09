/*
 Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. 
 A f�rmula que efetua tal c�lculo �:
 d=raiz.quadrada((x2-x1)^2+(y2-y1)^2)
 */

programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		inteiro x1,x2,y1,y2,d, aux1, aux2
		escreva("Por favor, digite um valor para x do seu primeiro ponto no plano: ")
		leia(x1)
		escreva("Por favor, digite um valor para y do seu primeiro ponto no plano: ")
		leia(y1)
		escreva("Por favor, digite um valor para x do seu segundo ponto no plano: ")
		leia(x2)
		escreva("Por favor, digite um valor para y do seu segundo ponto no plano: ")
		leia(y2)
		aux1 = mat.potencia(x2-x1, 2)
		aux2 = mat.potencia(y2-y1, 2)
		d = mat.raiz((aux1+aux2), 2)
		escreva("A dist�ncia entre os pontos citados no plano � igual a: ", d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 239; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */