package Jogo;

//Classe criada para teste.
public class TesteJogo1 {
		public static void main(String args[]) throws InterruptedException {
			Jogador1 j1 =new Jogador1("Sofia","sofi-fernandes@live.com","Chapeuzinho");//Nomea��o dos par�metros. 
			System.out.println(j1.getNome());
			System.out.println("\n");
			j1.imprimirInicoHistoria();//Nesta linha, est� sendo chamado o m�todo que cont�m a introdu��o da hist�ria do jogo.
			j1.verificaOpcaoCaminho();//J� nesta, o m�todo chamado � aquele que cont�m a verifica��o da op��o escolhida e suas consequentes a��es.
					
			Jogador2 j2 =new Jogador2("P�mela","pam@live.com","Chapeuzinho");//Nomea��o dos par�metros. 
			System.out.println("\n");
			System.out.println(j2.getNome());
			System.out.println("\n");
			j2.imprimirInicoHistoria();//Nesta linha, est� sendo chamado o m�todo que cont�m a introdu��o da hist�ria do jogo.
			j2.verificaOpcaoCaminho();//J� nesta, o m�todo chamado � aquele que cont�m a verifica��o da op��o escolhida e suas consequentes a��es.
		}
}
