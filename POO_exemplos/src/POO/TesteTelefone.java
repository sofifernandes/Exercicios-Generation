package POO;

public class TesteTelefone {
	public static void main(String args[]) {
		
		TelefoneCelular celular =  new TelefoneCelular();
		TelefoneFixo fixo = new TelefoneFixo();
		TelefonePublico publico = new TelefonePublico();
		
		Telefone telefone=null;
		
		int n = (int) (Math.random()*3.0);
		System.out.println(n);
		switch (n) {
			case 0:
				telefone=celular;
				break;
			case 1:
				telefone=fixo;
				break;
			case 2:
				telefone=publico;
				break;
			default:
				System.out.println("Erro de opção...");
		}
		if(telefone!=null) {
			telefone.disca("986868686");
			telefone.toca(3);
		}
		
		
	}
}
