/*
 Ler o nome de um aluno e as suas duas notas A e B, e após calcular a média
ponderada entre estas notas (A tem peso 1 e B tem peso 2). Verifique se a nota
digitada é valida, caso seja inválida, repita a leitura. Repetir este procedimento para
uma turma composta por cinco alunos, usando o comando While.
 */

programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro na=0
		real nota1, nota2, mp
		cadeia nome
		enquanto(na<=5)
		{
			escreva("\nDigite seu nome, por gentileza: ")
			leia(nome)
			escreva("Digite a primeira nota: ")
			leia(nota1)
			enquanto(nota1>10 ou nota1<0)
			{
				escreva("Digite a primeira nota novamente: ")
				leia(nota1)
			}
			escreva("Digite a segunda nota: ")
			leia(nota2)
			enquanto(nota2>10 ou nota2<0)
			{
				escreva("Digite a segunda nota novamente: ")
				leia(nota2)
			}
			mp=(nota1*1)+(nota2*2)/3
			escreva("Aluno: ", nome)
			escreva("\nMédia ponderada deste aluno: ", mp)
			
					
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 306; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */