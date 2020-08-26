package teste;

public class FuncionarioH extends Pessoa{
		private String departamento;
		
		public FuncionarioH (String nome, int matricula, String departamento) {
			super(nome,matricula);
			this.departamento=departamento;			
		}

		public String getDepartamento() {
			return departamento;
		}

		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}
		
		
}
