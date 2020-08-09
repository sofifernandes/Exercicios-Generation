/*
 Calcular o quanto o viajante gastará com combustível para a viagem. 
 */
programa
{
	funcao inicio()
	{
		real klitro, dis, pu, custo
		cadeia nome
		escreva("Por favor, digite seu nome: ")
		leia(nome)
		escreva("\n",nome + ", digite quantos quilômetros por litro seu carro faz?")
		leia(klitro)
		escreva("\nE qual será a distância a ser percorrida nessa viagem em quilometros: ")
		leia(dis)
		escreva("\n", nome + ", me informe qual o valor unitário do litro de combustível, por gentileza: ")
		leia(pu)
		custo = (dis/klitro)*pu
		escreva("\nO custo dessa viagem é igual a: ", custo, ". Boa viagem!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 71; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */