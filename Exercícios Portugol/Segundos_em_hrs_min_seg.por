/*
 Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos 
 e mostre-o expresso em horas, minutos e segundos.  
 */
programa
{
	funcao inicio()
	{
		inteiro segundos,horas, minutos
		cadeia nome
		escreva("Digite seu nome: ")
		leia(nome)
		escreva(nome + ", por favor, digite a dura��o do evento na sua f�brica em segundos: ")
		leia(segundos)
		horas = segundos/3600
		minutos =(segundos%3600)/60
		segundos = (segundos%3600)%60		
		escreva(nome + " a dura��o deste evento em horas, minutos e segundos, �: ", horas, " hora(s) ", minutos, " minuto(s) e ", segundos, " segundo(s) " )		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 99; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */