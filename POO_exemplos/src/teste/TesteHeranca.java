package teste;

public class TesteHeranca {
	public static void main(String args[])
	{
		Pessoa jessica = new Pessoa("Jessica",555);
		FuncionarioH pedro = new FuncionarioH("Pedro",222,"TI");
		Pessoa maria = new FuncionarioH("Maria",333,"Informática");
		Pessoa jose = new Coordenador("José", 444, "CC");
		
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());
		
	}
	
}
