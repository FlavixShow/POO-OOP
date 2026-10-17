public class Pessoa{
	private String nome;
	private int cpf;
	private String endereco;
	private String rg;
	
	
	public Pessoa(String nome, int cpf, String endereco, String rg){
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.rg = rg;
	}
	
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public int getCpf(){
		return cpf;
	}
	public void setCpf(int cpf){
		this.cpf = cpf;
	}
	
	public String getEndereco(){
		return endereco;
	}
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public String getRg(){
		return rg;
	}
	public void setRg(String rg){
		this.rg = rg;
	}
	
}
