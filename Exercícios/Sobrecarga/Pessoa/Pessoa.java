public class Pessoa{
	private String nome;
	private String sexo;
	private int mesDeNascimento;
	private int anoDeNascimento;
	
	public Pessoa(String nome){
		this.nome = nome;
		sexo = " - ";
		mesDeNascimento = 1;
		anoDeNascimento = 2000;
	}
	
	public Pessoa(String nome, String sexo, int mesDeNascimento, int anoDeNascimento){
		this.nome = nome;
		this.sexo = sexo;
		this.mesDeNascimento = mesDeNascimento;
		this.anoDeNascimento = anoDeNascimento;
	}
	
	public String mostraIdade(){
		int idade = 2018 - anoDeNascimento;
		if(mesDeNascimento < 10){
			idade--;
		}
		return "Nome: " + nome + " | Sexo: " + sexo + "Idade: " + idade;
	}
	
	public String mostraIdade(int mes, int ano){
		int idade = ano - anoDeNascimento;
		if(mesDeNascimento < mes){
			idade--;
		}
		return "Nome: " + nome + " | Sexo: " + sexo + "Idade: " + idade;
	}
}
