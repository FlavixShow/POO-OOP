public class Pessoa{
	private String nome;
	private String sexo;
	private Data nascimento;
	
	public Pessoa(String nome){
		this.nome = nome;
		this.sexo = "";
		this.nascimento = new Data();
	}
	
	public Pessoa(String nome, String sexo, Data nascimento){
		this.nome = nome;
		this.sexo = sexo;
		this.nascimento = nascimento;
	}
	
	public String mostraIdade(Data hoje){
		int idade = hoje.getAno() - nascimento.getAno();
		
		if(hoje.getDia() < nascimento.getDia() || hoje.getMes() < nascimento.getMes()){
			idade--;
		}
		
		return String.valueOf(idade);
	}
	
	public Data getData(){
		return nascimento;
	}
}
