public class Banco{
	public static void main(String[] args){
		ContaCorrente conta = new ContaCorrente("Nome 1", 1234);
		conta.cadastrarSenha(1234);
		conta.alterarSenha(1234, 123456);
		conta.alterarSenha(1234, 3333);
		
		conta.creditar(123456, 100);
		conta.debitar(123456, 50);
		
		System.out.println(conta.consultaSaldo(123456));
	}
}
