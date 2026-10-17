public class ContaEspecial extends ContaBancaria{
	private Double limite;
	
	
	public ContaEspecial(Pessoa cliente, int numeroDaConta, Double saldo, Double limite){
		super(cliente, numeroDaConta, saldo);
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(Double valor){
		if(valor < 0 || valor > (getSaldo()+limite)){
			return false;
		}
		setSaldo(getSaldo()-valor);
		return true;
	}
	
	
	public Double getLimite(){
		return limite;
	}
	public void setLimite(Double limite){
		this.limite = limite;
	}
}
