public class ContaCorrente{
	private String cliente;
	private int numero;
	private int senha = 0;
	private double saldo = 0.0;
	
	public ContaCorrente(String cliente, int numero){
		this.cliente = cliente;
		this.numero = numero;
		senha = 0;
		saldo = 0.0;
	}
	
	public boolean cadastrarSenha(int senha){
		if(this.senha == 0 && senha > 0){
			this.senha = senha;
			return true;
		}else{
			System.out.println("Há uma senha cadastrada ou senha informada é menor que zero.");
			return false;
		}
	}
	
	public boolean alterarSenha(int senhaAtual, int novaSenha){
		if(senha == senhaAtual){
			senha = novaSenha;
			return true;
		}else{
			System.out.println("Senha atual incorreta.");
			return false;
		}
	}
	
	public boolean debitar(int senha, int valor){
		if(this.senha == senha && valor >= 0 && valor <= this.saldo){
			saldo -= valor;
			return true;
		}else{
			System.out.println("Senha incorreta ou valor inválido.");
			return false;
		}
	}
	
	public boolean creditar(int senha, int valor){
		if(this.senha == senha && valor >= 0){
			saldo += valor;
			return true;
		}else{
			System.out.println("Senha incorreta ou valor inválido.");
			return false;
		}
	}
	
	public String consultaSaldo(int senha){
		if(this.senha == senha){
			return "Cliente: " + cliente + " | Saldo: " + saldo;
		}else{
			return "SENHA INVÁLIDA";
		}
	}
}
