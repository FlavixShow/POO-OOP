public class ContaBancaria{
	private Pessoa cliente;
	private int numeroDaConta;
	private Double saldo;
	
	
	public ContaBancaria(Pessoa cliente, int numeroDaConta, Double saldo){
		this.cliente = cliente;
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}
	
	
	public boolean sacar(Double valor){
		if(valor > saldo || valor < 0){
			return false;
		}
		saldo -= valor;
		return true;
	}
	
	public boolean depositar(Double valor){
		if(valor < 0){
			return false;
		}
		saldo += valor;
		return true;
	}
	
	
	public Pessoa getCliente(){
		return cliente;
	}
	public void setPessoa(Pessoa cliente){
		this.cliente = cliente;
	}
	
	public int getNumeroDaConta(){
		return numeroDaConta;
	}
	public void setNumeroDaConta(int numeroDaConta){
		this.numeroDaConta = numeroDaConta;
	}
	
	public Double getSaldo(){
		return saldo;
	}
	public void setSaldo(Double saldo){
		this.saldo = saldo;
	}
}
