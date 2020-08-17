package POO2;

public class TesteEmpregado {
	public static void main(String args[]) {
		
		Empregado nina = new Empregado("Nina","Rua marola, nº99","52052052050",948484848,26,322, 1500,15);
	
		nina.imprimirInfo();
		nina.calcularSalario();
	}

}
