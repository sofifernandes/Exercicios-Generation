/*
 Calcular o quanto o viajante gastar� com combust�vel para a viagem. 
 */
programa
{
	funcao inicio()
	{
		real klitro, dis, pu, custo
		cadeia nome
		escreva("Por favor, digite seu nome: ")
		leia(nome)
		escreva("\n",nome + ", digite quantos quil�metros por litro seu carro faz?")
		leia(klitro)
		escreva("\nE qual ser� a dist�ncia a ser percorrida nessa viagem em quilometros: ")
		leia(dis)
		escreva("\n", nome + ", me informe qual o valor unit�rio do litro de combust�vel, por gentileza: ")
		leia(pu)
		custo = (dis/klitro)*pu
		escreva("\nO custo dessa viagem � igual a: ", custo, ". Boa viagem!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 71; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */