public class Contas{
	public static void main(String[] args){
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Flávio");
		pessoa.setCpf("123.456.789-01");
		pessoa.setEndereco("Rua Y, Nº 31, Bairro Por do Sol");
		pessoa.setTelefone("(38)98888-8888");
		pessoa.setRenda(3000.00);
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.setPessoa(pessoa);
		conta.setNumeroDaConta(1234);
		conta.setSaldo(6000.00);
		
		
		printTeste(conta);
		
		conta.sacar(500);
		
		printTeste(conta);
		
		conta.depositar(1000);
		
		printTeste(conta);


		ContaBancaria conta2 = new ContaBancaria();
		
		conta2.setPessoa(pessoa);
		conta2.setNumeroDaConta(1235);
		conta2.setSaldo(4000.00);
		
		printTeste(conta2);
		
		conta2.sacar(500);
		
		printTeste(conta2);
		
		conta2.depositar(1000);
		
		printTeste(conta2);

	} 
	
	public static void printTeste(ContaBancaria conta){
		System.out.println(conta.getCliente().informacoes());
		System.out.println("Número: " + conta.getNumeroDaConta());
		System.out.println("Saldo:" + conta.getSaldo() + "\n");
	}
}
