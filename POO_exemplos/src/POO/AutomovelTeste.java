package POO;

public class AutomovelTeste {
	 
		   public static void main (String args []) {
		      //instanciando um objeto da classe Automovel
		      Automovel a = new Automovel ( "Edurdo","Palio", "JWO2125",   
                      2002);
		      //troca de mensagens (chamada ao metodo imprimir())
		      //a.getAno();
		      a.imprimirInfo();
		      System.out.println ("***Transferencia de Proprietario***");
		      a.setNomeProprietario("Rosa");
		      a.imprimirInfo();
		      Automovel b = new Automovel ("Rodrigo", "Parati", 
		                                   "JSX6481", 1999);
		      b.imprimirInfo();
		      System.out.println ("***Mudanca de Placa***");
		      b.setPlaca("SDK2581");
		      b.imprimirInfo();
		   }//fim do metodo main
		}//fim da classe AutomovelTeste

