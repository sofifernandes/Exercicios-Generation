/*
 Fa�a um programa que compute quantos s�o os m�ltiplos de 2, de 3 e de 5 entre 1 e
100; compute tamb�m quantos s�o os n�meros m�ltiplos de 2, 3 e 5 ao mesmo
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
		escreva("\nA quantidade de n�meros m�ltiplos de 2 entre 1 e 100 � igual a: ", cont1, "\n")
		escreva("\nA quantidade de n�meros m�ltiplos de 3 entre 1 e 100 � igual a: ", cont2,"\n")
		escreva("\nA quantidade de n�meros m�ltiplos de 5 entre 1 e 100 � igual a: ", cont3,"\n")
		escreva("\nA quantidade de n�meros m�ltiplos de 2, 3, e 5, ao mesmo tempo, entre 1 e 100, � igual a: ", cont4, "\n")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 166; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */