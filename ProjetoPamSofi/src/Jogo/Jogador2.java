package Jogo;

//Para utilizar nossos objetos instanciados "ler" e "entrada".
import java.util.Scanner;

	//Cria��o da classe herdeira da super classe Pessoa e inclus�o de novos atributos para Jogador, al�m dos que ele ir� herdar da super classe Pessoa.
	public class Jogador2 extends Pessoa{
			public String personagem;//Atributo extra, da classe Jogador.
			Scanner ler = new Scanner(System.in);
			Scanner entrada = new Scanner(System.in);
			float[] vetor = new float[10];//Declara��o do vetor usado no primeiro desafio.
			float[] vetor2 = new float[5];//Declara��o do vetor usado no segundo desafio.
			int[][] matriz = new int[3][3];//Declara��o da matriz para desafio segundo caminho
			int cont=0;//Contador utilizado para o primeiro desafio.
			int soma_diagonal=0;
			
			//Cria��o do m�todo construtor da classe Jogador.
			public Jogador2(String nome, String email, String personagem) {
				super(nome, email);//A palavra "super" refere-se � super classe Pessoa e as infomra��es herdadas por ela.
				this.personagem = personagem;
			}

			//Cria��o dos getter e setter para puxar as informa��es da classe Jogador.
			public String getPersonagem() {
				return personagem;
			}

			public void setPersonagem(String personagem) {
				this.personagem = personagem;
			}
			
			public String getNome() {
				System.out.println("Por gentileza, antes de recome�armos, me informe o seu sobrenome, o usarei para diferenci�-lo do jogador 1:");
				nome = ler.nextLine();
				return "Jogador 2: "+nome;
			}
			
			//M�todo para imprimir a introdu��o da hist�ria deste jogo.
			public void imprimirInicoHistoria(){
				System.out.println("M�e de Chapeuzinho: \n--Chapeuzinha minha filha, mam�e est� muito ocupada e preciso que voc� leve essa cesta com alguns rem�dios e doces para sua av�, \nela est� doente e essa cesta e sua visita v�o animar ela. E v� pela estrada, nada de ir pelo bosque!");
					//C�digo para ter uma pausa entre as frases.
					try {
						Thread.sleep(9000);
					} catch (InterruptedException e) {
				
						e.printStackTrace();
					}
					System.out.println("\n--Ent�o chapeuzinho decide seguir em dire��o a casa de sua av�.....");	
					//C�digo para ter uma pausa entre as frases.
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
					
						e.printStackTrace();
					}
			}
			
			//M�todo para puxar a op��o de caminho escolhida pelo jogador.
			public void verificaOpcaoCaminho() throws InterruptedException{			 
				//Pergunta ao usu�rio sobre qual caminho ele ir� escolher.
				System.out.println("\n"+"**"+personagem+", come�ou a chover, e voc� n�o tem nada para se proteger, qual caminho voc� ir� seguir?\n \n1- Estrada, segura por�m com muita chuva. \n2- Bosque, sem muita chuva mas perigoso.");
				//Lendo a op��o	escolhida. No caso, por tratar-se de uma vari�vel intera, ir� conter nela apenas o n�mero referente ao caminho escolhido (1 ou 2).
				int op = ler.nextInt();	
				//C�digo para ter uma pausa entre as frases.
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
					//La�o condicional para direcionar a hist�ria de acordo com o caminho escolhido(1-estrada/2-Bosque).
					switch (op){
						case 1: //Caso o usu�rio escolha o caminho 1(Estrada).
							System.out.println("\n--Ap�s alguns minutos de caminhada, voc� avista uma frecha de luz de um lindo p�r de sol, ap�s um pequeno per�odo de chuva. \nE isso lhe enche de for�as para seguir o longo caminho pela frente...");
							//C�digo para ter uma pausa entre as frases.
							try {
								Thread.sleep(4000);
							} catch (InterruptedException e) {
							
								e.printStackTrace();
							}
							//In�cio do primeiro desafio ao usu�rio
							System.out.println("\n--Mas nem tudo s�o rosas, para continuar nesse caminho, vamos testar sua me�ria!!\t(Preste aten��o aos n�meros que escreve e suas posi��es)");	
							//Preenchimento do vetor, para localiza��o do n�mero pedido na devida posi��o requerida.
							for(int i=0; i<10; i++) { 
							System.out.println("**Digite um n�mero de 1 a 10 para "+(i+1)+": ");
								vetor[i] = entrada.nextFloat();
							}
							//La�o de repeti��o usado apenas para pular linhas e tornar distante os valores preenchidos para o usu�rio n�o ver e cumprir honestamente com o desafio.
							for(int i=0; i<15; i++) { 
								System.out.println("\n");
							}
							//Desafio lan�ado ao usu�rio, validando o n�mero pedido com a posi��o pedida no vetor.
							System.out.println("\n"+"**"+personagem+", voc� se lembra qual n�mero escreveu na terceira casa? Digite o n�mero: " );
							float num_digitado = ler.nextFloat();						
							//Caso o usu�rio digite um n�mero diferente do que foi pedido para a posi��o pedida, repetir at� que acerte com o la�o de repeti��o while.
							while (num_digitado!=vetor[2]) {//Lembrete: o vetor conta as posi��es a partir de zero, ent�o para achar e comparar o n�mero digitado na posi��o 3, come�ando de 1, com o que est� no vetor, o vetor deve ser vetor[2].
								System.out.println("**Voc� errou! Digite novamente: ");
								num_digitado = ler.nextFloat();
								cont++;
							}
							//Esta vari�vel foi utilizada para guardar a quantidade de vezes que o usu�rio errou e digitou novamente, sendo contado se o usu�rio errar ao menos uma vez at� quantas vezes de fato errou.
							int num_vzs= cont;
							//Mensagem para continua��o da hist�ria.
							System.out.println("\n"+"--"+personagem+", voc� acertou...poder� prosseguir :D\n");
							//C�digo para ter uma pausa entre as frases.
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
							
								e.printStackTrace();
							}
							//Mensagem com nova mensagem de decis�o para o usu�rio.
							System.out.println("\n**Continuando sua caminhada, voc� encontra D.Maria, o que gostaria de fazer? \n1-Dizer ol�. \n2-Passar reto");
							//Leitura da decis�o do usu�rio (1-Dizer ol�/2-Passar reto). Neste caso, a vari�vel, por ser inteira, ir� conter nela apenas o n�mero referente � decis�o tomada (1 ou 2).
							int op_maria = ler.nextInt();						 
							if (op_maria==1){//La�o condicional para caso a op��o escolhida seja a 1.(Dizer ol� a D.Maria).
								//Nesta condi��o, estamos comparando a contabiliza��o feita anteriormente de quantas vezes o usu�rio errou, ou se errou pelo menos uma vez.
								if (num_vzs==0) {//Este primeiro refere-se ao caso de o usu�rio n�o errar nenhuma vez no primeiro desafio, e ter escolhido a op��o 1 ao encontrar a D.Maria(1-Dizer ol�).
									System.out.println("\n--Ap�s conversar com D.Maria,voc� continua sua caminhada e se depara com uma barraca de sorvete...");
									//C�digo para ter uma pausa entre as frases.
									try {
										Thread.sleep(3000);
									} catch (InterruptedException e) {
									
										e.printStackTrace();
									}
									//Utilizamos este contador para que, caso o usu�rio tenha passado direto no primeiro desafio, neste ponto ele n�o precisar� fazer o segundo desafio.
									System.out.println("\n**Como conseguiu o desafio de mem�ria sem errar nenhuma vez, voc� conquistou um sorvete, escolha o sorvete: \n1-Morango \n2-Nutella");
									//Vari�vel criada para ler a op��o de sabor de sorvete que o usu�rio ir� escolher. No caso, por tratar-se de uma vari�vel inteira, ir� reter nela apenas os n�meros referentes aos sabores(1 ou 2).
									int op_svt = ler.nextInt();
										//La�o condicional criado para verifica��o do sabor escolhido e diferencia��o de mensagens a partir disto.
										if (op_svt==1) {
											System.out.println("\n--Aproveite seu sorvete de Morango :D");
										}else {
											System.out.println("\n--Aproveite seu sorvete de Nutella :D");
										}
										//C�digo para ter uma pausa entre as frases.
										try {
											Thread.sleep(3000);
										} catch (InterruptedException e) {
										
											e.printStackTrace();
										}
									    System.out.println("\n--Ap�s aproveitar seu sorvete, voc� continuou sua caminhada e conseguiu chegar na sua av�. Parab�ns GUERREIRAAA!!!");
								
								}else {//Este else refere-se ao caso de o usu�rio ter errado o primeiro desafio ao menos uma vez, e escolhido a op��o 1 ao encontrar a D.Maria(1-Dizer ol�).
									//Mensagens referente ao segundo desafio.								
									System.out.println("\n--Ap�s conversar com D.Maria,voc� continua sua caminhada e se depara com uma barraca de sorvete...");
									//C�digo para ter uma pausa entre as frases.
									try {
										Thread.sleep(3000);
									} catch (InterruptedException e) {
									
										e.printStackTrace();
									}
									System.out.println("\n--Por�m, como n�o conseguiu alcan�ar seu primeiro desafio de primeira, voc� n�o receber� seu sorvete, a menos que consiga passar pelo pr�ximo desafio!");
									//Preenchimento do vetor, para localiza��o do n�meros que ser�o necess�rios para este segundo desafio.
									for(int i=0; i<10; i++) { 
										System.out.println("**Digite um n�mero de 1 a 10 para "+(i+1)+": ");
											vetor[i] = entrada.nextFloat();
									}
									//Opera��o a ser efetuada pelo usu�rio entre os n�meros requeridos, para compara��o das respostas.
									float mult = vetor[1]*vetor[4];
									//La�o de repeti��o usado apenas para pular linhas e tornar distante os valores preenchidos para o usu�rio n�o ver e cumprir honestamente com o desafio.
									for(int i=0; i<15; i++) { 
										System.out.println("\n");
									}
									//Desafio lan�ado ao usu�rio.
									System.out.println("\n**Se lembra dos n�meros que escreveu em segundo lugar e quinto lugar? Ok...digite o resultado da multiplica��o entre ambos: ");
									//Leitura da resposta do usu�rio.
									num_digitado = ler.nextFloat();
									//La�o condicional para validar se o resultado dado pelo usu�rio est� correto, para continua��o da hist�ria de acordo com essa compara��o. 
									//Desta vez, n�o foi utilizado o la�o de repeti��o while para que o usu�rio tivesse mais uma chance, pois neste desafio, ele ter� apenas uma chance ou ja ter�o outra consequ�ncias.
									if(num_digitado==mult) {//Este ser� o resultado para caso o resultado do usu�rio, ap�s a compara��o, esteja correto.
										System.out.println("**Parab�ns "+personagem+", voc� conseguiu passar por mais esse desafio, e ganhar� um sorvete, escolha qual sabor voc� quer: \n1-Morango\n2-Nutella");
										//Vari�vel criada para ler a op��o de sabor de sorvete que o usu�rio ir� escolher. No caso, por tratar-se de uma vari�vel inteira, ir� reter nela apenas os n�meros referentes aos sabores(1 ou 2).
										int op_svt = ler.nextInt();									
										if (op_svt==1) {//La�o condicional criado para verifica��o do sabor escolhido e diferencia��o de mensagens a partir disto.
											System.out.println("\n--Aproveite seu sorvete de Morango :D");
										}else {
											System.out.println("\n--Aproveite seu sorvete de Nutella :D");
										}
										//C�digo para ter uma pausa entre as frases.
										try {
											Thread.sleep(4000);
										} catch (InterruptedException e) {
										
											e.printStackTrace();
										}
										System.out.println("\n--Ap�s aproveitar seu sorvete, voc� continuou sua caminhada e conseguiu chegar na sua av�. Parab�ns GUERREIRAAA!!!");
									
									}else {//Este ser� o resultado para caso o resultado do usu�rio, ap�s a compara��o, esteja incorreto.
											System.out.println("--Sinto muito, mas voc� n�o conseguiu passar por mais esse desafio, e n�o ganhar� um sorvete :/");
											//C�digo para ter uma pausa entre as frases.
											try {
												Thread.sleep(4000);
											} catch (InterruptedException e) {
											
												e.printStackTrace();
											}
											System.out.println("\n--Ap�s continuar sua jornada at� a casa de sua av�, mesmo sem sorvete, voc� conseguiu chegar em seguran�a.Parab�s!!!");
									}
									
							 }						
							}else {	//La�o condicional para caso a op��o escolhida seja a 2.(Passar reto pela D.Maria).						
								//Nesta condi��o, estamos comparando a contabiliza��o feita anteriormente de quantas vezes o usu�rio errou, ou se errou pelo menos uma vez.
								if (num_vzs==0) {//Este primeiro refere-se ao caso de o usu�rio n�o errar nenhuma vez no primeiro desafio, e ter escolhido a op��o 2 ao encontrar a D.Maria(2-Passar reto).
									System.out.println("\n--Voc� continua sua caminhada e se depara com uma barraca de sorvete...");
									//C�digo para ter uma pausa entre as frases.
									try {
										Thread.sleep(4000);
									} catch (InterruptedException e) {
									
										e.printStackTrace();
									}								
									//Utilizamos este contador para que, caso o usu�rio tenha passado direto no primeiro desafio, neste ponto ele n�o precisar� fazer o segundo desafio.
									System.out.println("\n**Como conseguiu o desafio de mem�ria sem errar nenhuma vez, voc� conquistou um sorvete, escolha o sorvete: \n1-Morango \n2-Nutella");
									//Vari�vel criada para ler a op��o de sabor de sorvete que o usu�rio ir� escolher. No caso, por tratar-se de uma vari�vel inteira, ir� reter nela apenas os n�meros referentes aos sabores(1 ou 2).
									int op_svt = ler.nextInt();
									//La�o condicional criado para verifica��o do sabor escolhido e diferencia��o de mensagens a partir disto.
										if (op_svt==1) {
											System.out.println("\n--Aproveite seu sorvete de Morango :D");
										}else {
											System.out.println("\n--Aproveite seu sorvete de Nutella :D");
										}
										//C�digo para ter uma pausa entre as frases.
										try {
											Thread.sleep(4000);
										} catch (InterruptedException e) {
										
											e.printStackTrace();
										}
									    System.out.println("\n--Ap�s aproveitar seu sorvete, voc� continuou sua caminhada e conseguiu chegar na sua av�. Parab�ns GUERREIRAAA!!!");
								}else {//Este else refere-se ao caso de o usu�rio ter errado o primeiro desafio ao menos uma vez, e escolhido a op��o 2 ao encontrar a D.Maria(2-Passar reto).
									//Mensagens referente ao segundo desafio.
									System.out.println("\n--Voc� continua sua caminhada e se depara com uma barraca de sorvete...");
									//C�digo para ter uma pausa entre as frases.
									try {
										Thread.sleep(4000);
									} catch (InterruptedException e) {
									
										e.printStackTrace();
									}
									System.out.println("\n--Por�m, como n�o conseguiu alcan�ar seu primeiro desafio de primeira, voc� n�o receber� seu sorvete, a menos que consiga passar pelo pr�ximo desafio!");
									//Preenchimento do vetor, para localiza��o do n�meros que ser�o necess�rios para este segundo desafio.
									for(int i=0; i<10; i++) { 
										System.out.println("**Digite um n�mero de 1 a 10 para "+(i+1)+": ");
											vetor[i] = entrada.nextFloat();
									}
									//Opera��o a ser efetuada pelo usu�rio entre os n�meros requeridos, para compara��o das respostas.
									float mult = vetor[1]*vetor[4];
									//La�o de repeti��o usado apenas para pular linhas e tornar distante os valores preenchidos para o usu�rio n�o ver e cumprir honestamente com o desafio.
									for(int i=0; i<15; i++) { 
										System.out.println("\n");
									}
									//Desafio lan�ado ao usu�rio.
									System.out.println("\n**Se lembra dos n�meros que escreveu em segundo lugar e quinto lugar? Ok...digite o resultado da multiplica��o entre ambos: ");
									//Leitura da resposta do usu�rio.
									num_digitado = ler.nextFloat();
									//La�o condicional para validar se o resultado dado pelo usu�rio est� correto, para continua��o da hist�ria de acordo com essa compara��o. 
									//Desta vez, n�o foi utilizado o la�o de repeti��o while para que o usu�rio tivesse mais uma chance, pois neste desafio, ele ter� apenas uma chance ou ja ter�o outra consequ�ncias.
									if(num_digitado==mult) {
										System.out.println("**Parab�ns "+personagem+", voc� conseguiu passar por mais esse desafio, e ganhar� um sorvete, escolha qual sabor voc� quer: \n1-Morango\n2-Nutella");
										//Vari�vel criada para ler a op��o de sabor de sorvete que o usu�rio ir� escolher. No caso, por tratar-se de uma vari�vel inteira, ir� reter nela apenas os n�meros referentes aos sabores(1 ou 2).
										int op_svt = ler.nextInt();
										//La�o condicional criado para verifica��o do sabor escolhido e diferencia��o de mensagens a partir disto.
										if (op_svt==1) {
											System.out.println("\n--Aproveite seu sorvete de Morango :D");
										}else {
											System.out.println("\n--Aproveite seu sorvete de Nutella :D");
										}
										//C�digo para ter uma pausa entre as frases.
										try {
											Thread.sleep(4000);
										} catch (InterruptedException e) {
										
											e.printStackTrace();
										}
										System.out.println("\n--Ap�s aproveitar seu sorvete, voc� continuou sua caminhada e conseguiu chegar na sua av�. Parab�ns GUERREIRAAA!!!");
									
									}else {//Este ser� o resultado para caso o resultado do usu�rio, ap�s a compara��o, esteja incorreto.
											System.out.println("--Sinto muito, mas voc� n�o conseguiu passar por mais esse desafio, e n�o ganhar� um sorvete :/");
											//C�digo para ter uma pausa entre as frases.
											try {
												Thread.sleep(4000);
											} catch (InterruptedException e) {
											
												e.printStackTrace();
											}
											System.out.println("\n--Ap�s continuar sua jornada at� a casa de sua av�, mesmo sem sorvete, voc� conseguiu chegar em seguran�a.Parab�s!!!");
									}
									
								}
							}
							//Para caso a op��o de caminho (Estrada ou Bosque), entrar no caso 1(Estrada), para a execu��o do programa neste caso, e n�o executar os pr�ximos.
							break;
							
						case 2://Caso o usu�rio escolha o caminho 2(Bosuqe).
							System.out.println("O bosque � t�o denso, que voc� n�o sabe se o sol ainda paira sobre voc�...");
							Thread.sleep(4000);//tempo de 2 sg
							System.out.println("...VOC� V� UM VULTO!!");
							System.out.println("Rapido!! escolha sua a��o!!\n1 -- Correr!!\n2 -- Lutar!!");
							int acao = ler.nextInt();
							if (acao == 1) {
								    System.out.println("\t **Narrador \nO vulto aparece na sua frente, voc� fita aqueles enormes olhos que lhe paralizam...� um lobo...e agora?");
							     	Thread.sleep(5000);
							     	 System.out.println();
								    System.out.println("\t **Narrador \nMe parece que s� lhe resta pedir por miseric�rdia.");
								    Thread.sleep(5000);
								    System.out.println();
								    System.out.println("\t **Chapeuzinho \nSENHOR LOBO POR FAVOR POUPE MINHA VIDA, TOME LEVE ESSA CESTA DE DOCES, MAS ME DEIXE VIVA!!!");
								    Thread.sleep(5000);
								    System.out.println();
									System.out.println("\t **Lobo \nchapeuzinho chapeuzinho...minha doce garotinha, a miseric�rdia n�o vem a quem n�o faz\npor merecer, ent�o me responda a essa pergunta corretamente e levarei pouco,\\n responda errado ent�o levarei tudo...");
									Thread.sleep(10000);
									System.out.println();
									System.out.println("Diga o que sou e eu desapare�oo. O que sou eu?");
									Thread.sleep(5000);//tempo de 2 sg
									System.out.println();
									System.out.println("\t**Escolha o n�mero da sua resposta:");
									System.out.println("1 -- O Sil�ncio \n2 -- Saci-perer�\n3 -- O tempo\n4 -- Uma piada ");
									System.out.println();
									int op2 = ler.nextInt();
									
									if(op2 == 1)
									{
										Thread.sleep(5000);
										System.out.println("\t**Lobo \nHUAHAHAhahah.Adeus garota...ou at� logo...");
										Thread.sleep(5000);
										System.out.println("\t**Narrador** \nO lobo sumiu e com ele a sua cesta....voc� seguiu em frente toda tr�mula, \nchegando em sua v� voc� conta tudo e recebe um abra�o e depois uma\nbronca. Voc� aprendeu uma li��o!");
									}
									else
									{
										Thread.sleep(5000);
										System.out.println("\t**Lobo \nHUAHAHAhahah que pena garota.. a miseric�rdia n�o olhou por voc� hoje...");
										Thread.sleep(5000);
										System.out.println("\t**Narrador \nA escurid�o partiu mas junto a ele levou sua luz...horas depois um viajante\n lhe encontra e lhe guia at� a casa de sua av�, voc� n�o � mais capaz de enxergar...");
										
									}
							}//fecha if correr
							if (acao == 2)
							{
								System.out.println("\t**Narrador \nVoc� escolheu lutar, voc� tem fibra gosto disso, agora vamos l�. voc� olha ao seu redor\n" + 
										"e em seu alcance temos um galho potencialmente danoso, voc� agacha r�pido!! o agarra e o levanta acima da cabe�a.");
																		
								
								System.out.printf("Mas antes, me de 9 n�meros, de 1 a 9 e preste aten��o!! ");
								for(int linha=0; linha<3; linha++) {
									for(int coluna = 0; coluna<3; coluna++) {
										System.out.printf("\nDigite um n�mero: ");
										matriz[linha][coluna]=entrada.nextInt();										
									}																
								}
								//589afddg participa��o do meu gato						
								int soma_diagonal = matriz[0][0]+matriz[1][1]-matriz[2][2];
								for(int i=0; i<15; i++) { 
									System.out.println("\n");
								}
								Thread.sleep(2000);
								System.out.println("Agora me diga qual a soma dos n�meros digitados em primeiro e quinto lugar menos o nono lugar?\n respondendo corretamente e esse valor ira ser sua for�a de ataque + 10\n mas se errar voc� ir� falhar...");
								num_digitado=ler.nextFloat();
								if(soma_diagonal == num_digitado)
								{
									soma_diagonal = soma_diagonal + 10;
									Thread.sleep(3000);
									System.out.println("\t**Narrador \nVoc� ataca, com uma for�a de "+soma_diagonal+" e no mesmo instante voc� corre, voc� n�o pensa s� corre!!");
									System.out.println();
									Thread.sleep(5000);
									System.out.println("Snif...Snif...Snif...");
									Thread.sleep(5000);
									System.out.println();
									System.out.println("Voc� para...olha em dire��o ao lobo, que est� curvado como uma crian�a enquanto \nchora com um galo vermelho na cabe�a.");
									Thread.sleep(5000);
									System.out.println();
									System.out.println("Voc� se comove, e com cautela se aproxima e lhe oferece um bolinho, o lobo levanta o rosto e fita\n o bolinho com lagrimas nos olhos, ele pega come em uma bocada s�, e lhe agradece? ");
									Thread.sleep(5000);
									System.out.println();
									System.out.println("Sim, ele fala O-O' ");
									Thread.sleep(5000);	
									System.out.println();
									System.out.println("Ele lhe acompanhou todo o caminho at� sua v�, lhe guiando \npelos caminhos mais seguros, e no caminho voc�s conversaram bastante.");
									Thread.sleep(5000);	
									System.out.println();
									System.out.println("**Narrador**\n Me parece que voc� encontrou um valioso amigo <3 ");
								}else
								{
									Thread.sleep(3000);
									System.out.println("Voc� falhou...");
									Thread.sleep(3000);
									System.out.println("Naquela noite um uivo ecoou pelo bosque...");
									Thread.sleep(3000);
									System.out.println("Ningu�m nunca mais viu a chapeuzinho...");
									Thread.sleep(3000);
									System.out.println("Agora temos uma lenda que diz que naquele bosque, uma garotinha e um enorme lobo correm e brincam por l�");
								}
							}	
								break;
							default:
								//Op��o para caso o usu�rio n�o escolha os caminhos oferecidos (1-Estrada ou 2-Bosque).
								System.out.println("Digite um op��o v�lida");
					 }			
					Thread.sleep(10000);	
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("FIM \nOi oi, obrigadinha por jogar :3 \nProjeto de: \nP�mela Xavier\nSofia Fernandes");
						
				}
											
}
			 		
	

