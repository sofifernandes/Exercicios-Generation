/*
 A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:��
a) m�dia do sal�rio da popula��o;
b) m�dia do n�mero de filhos;
c) maior sal�rio;
d) percentual de pessoas com sal�rio at� R$100,00.
 */


programa
{
	
     inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		inteiro nh, nf
		real sal,media_sal, media_nf, perc=0, maior_sal=0, y=0, soma_sal=0,soma_nf=0
		para (nh=1; nh<=20; nh++){
			escreva("Por favor, informe o seu sal�rio: ")
			leia(sal)
			escreva("Agora, nos informe quantos filhos voc� tem: ")
			leia(nf)			
			limpa()
			soma_sal=soma_sal+sal
			soma_nf= soma_nf+nf
			se (sal<=100){
				y++
			}se (maior_sal<sal){
		   		maior_sal = sal
			}			
		}		
		perc = (y*100)/20
		media_sal = soma_sal/20
		media_nf = soma_nf/20
		
		escreva("A m�dia salarial entre os entrevistados � igual a: ", media_sal)
		escreva("\nA m�dia de filhos entre esses habitantes � igual a: ", mat.arredondar(media_nf, 2))
		escreva("\nO percentual de pessoas com sal�rios at� R$100,00 � igual a:  ", perc)
		escreva("\nPor fim, o maior sal�rio entre os indicados � igual a: ", maior_sal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 290; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */