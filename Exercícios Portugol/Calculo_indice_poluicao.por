/*
  A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são altamente poluentes do meio ambiente. 
 O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, 
 se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem 
 ser notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição medido e emita a notificação 
 adequada aos diferentes grupos de empresas. 
 */

programa
{
	funcao inicio()
	{
		real ip
		cadeia nome
		escreva("Por favor, digite seu nome: ")
		leia(nome)
		escreva(nome+", digite qual o índice de poluíção neste momento: ")
		leia(ip)
		se (ip >= 0.00 e ip<0.05) {
		    escreva("Por favor, digite um valor igual ou acima de 0.05!")
		} senao se(ip>=0.05 e ip<=0.25) {
			escreva("Este índice ainda está dentro do aceitável!")
			}senao se(ip==0.3){
				escreva("Nível não aceitável, indústrias do 1º grupo devem suspender suas atividades imediatamente!")
				}senao se (ip==0.4) {
					escreva("Nível não aceitável, as indústrias do 1º e 2º grupo devem suspender suas atividades imediatamente!!")
					}senao se (ip==0.4){
						escreva("PERIGO!! Nível muito acima do aceitável, todas os grupos devem paralisar suas atividades imediatamente!!!")
					}senao {
						escreva("Caso o índice digitado esteja acima do 0,5, mantém-se a ordem de paralisação imediata!!!")
					}
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1560; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */