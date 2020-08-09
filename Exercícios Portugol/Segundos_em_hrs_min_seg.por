/*
 Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos 
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
		escreva(nome + ", por favor, digite a duração do evento na sua fábrica em segundos: ")
		leia(segundos)
		horas = segundos/3600
		minutos =(segundos%3600)/60
		segundos = (segundos%3600)%60		
		escreva(nome + " a duração deste evento em horas, minutos e segundos, é: ", horas, " hora(s) ", minutos, " minuto(s) e ", segundos, " segundo(s) " )		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 99; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */