package POO;

public class TestePaciente {
	public static void main(String  args[]) {
	
		Paciente p1 = new Paciente ("Sabrina", "40240240240", "Rua qualquer, nº 99","sabrina@outlook.com", "Doença renal", 26, 944448888);
		p1.imprimirInfo();
		p1.validarCpf();
		
	}
}
