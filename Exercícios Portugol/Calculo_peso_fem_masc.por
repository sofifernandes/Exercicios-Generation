/*
 Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um sistema que calcule seu peso ideal, utilizando as seguintes fórmulas: 

Para homens: (72.7*h) - 58 

Para mulheres: (62.1*h) - 44.7 (h = altura)
 */
programa
{
	funcao inicio()
	{
		real altura, peso
		cadeia nome, sexo
		escreva("Por gentileza, nos informe seu nome: ")
		leia(nome)
		escreva(nome+", qual sua altura? (escreva no seguinte formato: x.xx): ")
		leia(altura)
		escreva("Agora, nos informe qual seu sexo: ")
		leia(sexo)
		se (sexo == "feminino") {
			peso = (72.7*altura)-58
			escreva(nome+", seu peso ideal é igual a: ", peso)
		}senao se (sexo == "masculino"){
		     peso = (62.1*altura)-44.7
		     escreva(nome+", seu peso ideal é igual a: ", peso)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 225; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */