/*
  Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. Considerar que a m�dia � ponderada 
  e que o peso das notas �: 2,3 e 5, respectivamente.  
 */

programa
{
	funcao inicio()
	{
		real nota1, nota2, nota3, nf
		escreva("Por gentileza, digite a primeira nota: ")
		leia(nota1)
		escreva("Agora, digite a segunda nota: ")
		leia(nota2)
		escreva("Por fim, digite a terceira nota: ")
		leia(nota3)
		nf = (nota1*2+nota2*3+nota3*5)/10
		escreva("A nota final � igual a: ", nf)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 128; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */