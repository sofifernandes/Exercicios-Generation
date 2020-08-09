/*
 Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
 caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente. 
 */
programa
{
	funcao inicio()
	{
		real C, N, E, st, sal_exc, sn
		cadeia nome
		escreva("Por favor, digite seu nome: ")
		leia(nome)
		escreva(nome+ ", por gentileza, agora informe quanto horas você trabalhou: ")
		leia(N)
		escreva("Por fim, indique o seu código: ")
		leia(C)
		limpa()
		se (N <= 50) {
		    st = N*10
		    sal_exc = 0
		    escreva(nome + ", o número de horas trabalhadas não excedeu o limite, sendo assim, o salário total a ser recebido é igual a: ", st, "\nE o valor de salário excedente: ", sal_exc)
			
		} senao {
			E=N-50 
			sal_exc = E*20
			st= sal_exc + 500
			escreva(nome + ", o número de horas excedeu ao limite, sendo assim, o salário total é igual a: ", st, "\nE o valor do salário execente a ser ganho é igual a: ", sal_exc)						
		}
		escreva("\n\nResumindo: ")
		escreva("\nNome: ", nome)
		escreva("\nCódigo do operário: ", C)
		escreva("\nExcesso: ",sal_exc)
		escreva("\nSalario do operário: ", st)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 319; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */