/*
 Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento armazenando-o na vari�vel E, 
 caso contr�rio zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio excedente. 
 */
programa
{
	funcao inicio()
	{
		real C, N, E, st, sal_exc, sn
		cadeia nome
		escreva("Por favor, digite seu nome: ")
		leia(nome)
		escreva(nome+ ", por gentileza, agora informe quanto horas voc� trabalhou: ")
		leia(N)
		escreva("Por fim, indique o seu c�digo: ")
		leia(C)
		limpa()
		se (N <= 50) {
		    st = N*10
		    sal_exc = 0
		    escreva(nome + ", o n�mero de horas trabalhadas n�o excedeu o limite, sendo assim, o sal�rio total a ser recebido � igual a: ", st, "\nE o valor de sal�rio excedente: ", sal_exc)
			
		} senao {
			E=N-50 
			sal_exc = E*20
			st= sal_exc + 500
			escreva(nome + ", o n�mero de horas excedeu ao limite, sendo assim, o sal�rio total � igual a: ", st, "\nE o valor do sal�rio execente a ser ganho � igual a: ", sal_exc)						
		}
		escreva("\n\nResumindo: ")
		escreva("\nNome: ", nome)
		escreva("\nC�digo do oper�rio: ", C)
		escreva("\nExcesso: ",sal_exc)
		escreva("\nSalario do oper�rio: ", st)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 319; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */