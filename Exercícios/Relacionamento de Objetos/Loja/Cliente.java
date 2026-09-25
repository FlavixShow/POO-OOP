public class Cliente{
	private String nome;
	private String cpf;
	private Double renda;
	private Double limiteDeCredito;
	
	public Cliente(String nome, String cpf, Double renda){
		this.nome = nome;
		this.cpf = cpf;
		this.renda = renda;
		this.calculaLimite();
	}
	
	public void calculaLimite(){
		limiteDeCredito = 2.5 * renda;
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getCpf(){
		return cpf;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public Double getRenda(){
		return renda;
	}
	public void setRenda(Double enda){
		this.renda = renda;
		calculaLimite();
	}
	
	public Double getLimiteDeCredito(){
		return limiteDeCredito;
	}
}
