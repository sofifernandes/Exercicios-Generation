/*
 Leia um vetor de 40 posições. Contar e escrever quantos valores
pares ele possui.
 */
programa
{
	funcao inicio()
	{
		
		inteiro numero[40],x, cont=0

		para (x=0;x<40;x++)//popular o vetor
		{
			escreva("Entre com um número: ")
			leia(numero[x])
			se (numero[x]%2==0){
				cont++
			}
		}
		limpa()
		escreva("\nNesse vetor há ", cont, " números pares")
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 85; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */