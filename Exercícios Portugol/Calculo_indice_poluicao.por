/*
  A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de ind�strias que s�o altamente poluentes do meio ambiente. 
 O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades, 
 se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem 
 ser notificados a paralisarem suas atividades. Fa�a um sistema que leia o �ndice de polui��o medido e emita a notifica��o 
 adequada aos diferentes grupos de empresas. 
 */

programa
{
	funcao inicio()
	{
		real ip
		cadeia nome
		escreva("Por favor, digite seu nome: ")
		leia(nome)
		escreva(nome+", digite qual o �ndice de polu���o neste momento: ")
		leia(ip)
		se (ip >= 0.00 e ip<0.05) {
		    escreva("Por favor, digite um valor igual ou acima de 0.05!")
		} senao se(ip>=0.05 e ip<=0.25) {
			escreva("Este �ndice ainda est� dentro do aceit�vel!")
			}senao se(ip==0.3){
				escreva("N�vel n�o aceit�vel, ind�strias do 1� grupo devem suspender suas atividades imediatamente!")
				}senao se (ip==0.4) {
					escreva("N�vel n�o aceit�vel, as ind�strias do 1� e 2� grupo devem suspender suas atividades imediatamente!!")
					}senao se (ip==0.4){
						escreva("PERIGO!! N�vel muito acima do aceit�vel, todas os grupos devem paralisar suas atividades imediatamente!!!")
					}senao {
						escreva("Caso o �ndice digitado esteja acima do 0,5, mant�m-se a ordem de paralisa��o imediata!!!")
					}
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1560; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */