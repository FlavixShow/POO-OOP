public class ContaBancaria{
	private Pessoa cliente;
	private int numeroDaConta;
	private Double saldo;
	
	
	public boolean sacar(float saque){
		if(saque > saldo){
			return false;
		}
		saldo -= saque;
		return true;
	}
	
	public boolean depositar(float deposito){
		if(deposito < 0){
			return false;
		}
		saldo += deposito;
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
