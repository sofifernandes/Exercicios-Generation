programa
{
	funcao inicio()
	{
		real a, b, c, d, E, f, x, y
		escreva("Por favor, digite um n�mero para a: ")
		leia(a)
		escreva("Por favor, digite um n�mero para b: ")
		leia(b)
		escreva("Por favor, digite um n�mero para c: ")
		leia(c)
		escreva("Por favor, digite um n�mero para d: ")
		leia(d)
		escreva("Por favor, digite um n�mero para e: ")
		leia(E)
		escreva("Por favor, digite um n�mero para f: ")
		leia(f)
		x = (c*E - b*f)/(a*E - b*d)
		y = (a*f - c*d)/(a*E - b*d)
		escreva("Os valores de x e y, respectivamente, s�o: ", x, " e ", y)
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 37; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */