/*
 Faça um programa que compute quantos são os múltiplos de 2, de 3 e de 5 entre 1 e
100; compute também quantos são os números múltiplos de 2, 3 e 5 ao mesmo
tempo.
 */

programa
{
	funcao inicio()
	{
		inteiro x, num, cont1=0, cont2=0, cont3=0, cont4=0
				
		para(x=1; x<=100; x++){
			 se (x%2==0){
			 	cont1++
			 }se(x%3==0){
			     cont2++
			 }se (x%5==0){
			 	cont3++
			 }se (x%2==0 e x%3==0 e x%5==0){
		      	cont4++
		      }     
		}
		escreva("\nA quantidade de números múltiplos de 2 entre 1 e 100 é igual a: ", cont1, "\n")
		escreva("\nA quantidade de números múltiplos de 3 entre 1 e 100 é igual a: ", cont2,"\n")
		escreva("\nA quantidade de números múltiplos de 5 entre 1 e 100 é igual a: ", cont3,"\n")
		escreva("\nA quantidade de números múltiplos de 2, 3, e 5, ao mesmo tempo, entre 1 e 100, é igual a: ", cont4, "\n")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 166; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */