/*
  O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro 
 e escreva o custo ao consumidor.  
 */
programa
{
	funcao inicio()
	{
	 	real cf, ccon
		escreva("Por gentileza, escreva o valor do custo de f�brica: ")
		leia(cf)
		ccon = cf + (cf*0.73)
		escreva("O custo deste carro para o concumidor ser� igual a: ", ccon)	
	
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