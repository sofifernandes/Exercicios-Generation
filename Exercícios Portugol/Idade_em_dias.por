/*
 Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias 
 e mostre-a expressa apenas em dias.�
 */


programa
{
	funcao inicio()
	{
		inteiro idade, dias, meses, anos
		cadeia nome
		escreva("Digite seu nome: ")
		leia(nome)
		escreva(nome + ", por favor, digite sua idade em anos: ")
		leia(anos)
		escreva(nome + ", agora, por favor, digite sua idade em meses: ")
		leia(meses)
		escreva(nome + ", para finalizar, por favor, digite sua idade em dias: ")
		leia(dias)
		idade = (anos*365) + (meses*30) + (dias*1)
		escreva(nome + ",sua idade em dias	� igual a: ",idade)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 157; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */