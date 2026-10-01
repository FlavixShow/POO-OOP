public class Pessoa{
	private String nome;
	private int diaDeNascimento;
	private int mesDeNascimento;
	private String telefone;
	
	
	public Pessoa(String nome, int diaDeNascimento, int mesDeNascimento, String telefone){
		this.nome = nome;
		this.diaDeNascimento = diaDeNascimento;
		this.mesDeNascimento = mesDeNascimento;
		this.telefone = telefone;
	}
	
	public Pessoa(String nome){
		this.nome = nome;
		this.diaDeNascimento = 0;
		this.mesDeNascimento = 0;
		this.telefone = "Indefinido";
	}
	
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public int getDiaDeNascimento(){
		return diaDeNascimento;
	}
	public void setDiaDeNascimento(int diaDeNascimento){
		this.diaDeNascimento = diaDeNascimento;
	}
	
	public int getMesDeNascimento(){
		return mesDeNascimento;
	}
	public void setMesDeNascimento(int mesDeNascimento){
		this.mesDeNascimento = mesDeNascimento;
	}
	
	public String getTelefone(){
		return telefone;
	}
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
}
