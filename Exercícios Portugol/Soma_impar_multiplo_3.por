/*
 Desenvolver um sistema que efetue a soma de todos os números ímpares que são
múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
 */
programa
{
	funcao inicio()
	{
		inteiro num, soma_num=0
		para (num=1; num<=500; num++){
			se(num % 2!=0 e num%3==0){
					soma_num = soma_num+num
			}
		}
		escreva("A soma dos números ímpares e múltiplos de três dentro do conjunto de números de 1 até 500 é igual a:  ", soma_num)
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 155; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */