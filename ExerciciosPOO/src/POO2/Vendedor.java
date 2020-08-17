package POO2;

public class Vendedor extends Pessoa {
		private String setor;
		private double valorVendas;
		private double comissao;
		private int qntProdEstoque;
		private int qntProdVendido;
		
		
		public Vendedor(String nome, String endereco, String cpf, int telefone, int idade, String setor,
				double valorVendas, double comissao, int qntProdEstoque, int qntProdVendido) {
			super(nome, endereco, cpf, telefone, idade);
			this.setor = setor;
			this.valorVendas = valorVendas;
			this.comissao = comissao;
			this.qntProdEstoque = qntProdEstoque;
			this.qntProdVendido = qntProdVendido;
		}


		public String getSetor() {
			return setor;
		}


		public void setSetor(String setor) {
			this.setor = setor;
		}


		public void calcularSalario() {
				double meta = qntProdEstoque-qntProdVendido;
				if(meta==0 && setor=="Móveis") {
					comissao=getComissao();
					double salario = valorVendas + (valorVendas*(comissao/100));
					System.out.println("Você conquistou a meta de vender todo o estoque, sendo assim, o valor total a ser recebido pelo vendedor "+getNome()+" é igual a: "+salario);
				}else{
					comissao=0;
					double salario = valorVendas + (valorVendas*(comissao/100));
					System.out.println("Você não conquistou a meta de vender todo o estoque, sendo assim, o valor total a ser recebido pelo vendedor "+getNome()+" é igual a: "+salario);
				}
		}
		
				
		public void imprimirInfo (){
		    System.out.println("\nNome do fornecedor: "+getNome()+"\n"+"Cpf: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()+"\n"+"Endereço: "+getEndereco()+"\nValor monetário total dos artigos vendidos por "+getNome()+": "+valorVendas+"\nPorcentagem da comissao deste artigo: "+comissao);
		}		
		
		
		public int getQntProdEstoque() {
			return qntProdEstoque;
		}

		public void setQntProdEstoque(int qntProdEstoque) {
			this.qntProdEstoque = qntProdEstoque;
		}

		public int getQntProdVendido() {
			return qntProdVendido;
		}

		public void setQntProdVendido(int qntProdVendido) {
			this.qntProdVendido = qntProdVendido;
		}

		public double getValorVendas() {
			return valorVendas;
		}

		public void setValorVendas(double valorVendas) {
			this.valorVendas = valorVendas;
		}

		public double getComissao() {
			return comissao;
		}

		public void setComissao(double comissao) {
			this.comissao = comissao;
		}
		
		
		
		
		
		
		
}
