/*
  Faça um sistema que leia a idade de uma pessoa expressa em dias 
 e mostre-a expressa em anos, meses e dias.
 */

programa
{
	funcao inicio()
	{
		inteiro dias, dias1=0, anos, meses
		cadeia nome
		escreva("Digite seu nome: ")
		leia(nome)
		escreva(nome, ", por favor, digite sua idade em dias: ")
		leia(dias)
		anos = dias1/365
		meses = (dias1%365)/30
		dias = (dias1%365)%30
		escreva(nome, "Sua idade em anos, meses e dias, respectivamente, é igual a: ", anos, "anos ", meses, " meses e ", dias, " dias.")
		
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 117; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */