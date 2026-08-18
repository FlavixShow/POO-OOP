public class Aluno{
	int matricula;
	String nome, cpf, endereco;
	
	public Aluno(int novaMatricula, String novoNome, String novoCpf, String novoEndereco){
		matricula = novaMatricula;
		nome = novoNome;
		cpf = novoCpf;
		endereco = novoEndereco;
	}
	
	public String toString(){
		return "Matrícula: " + matricula + " | Nome: " + nome + " | CPF: " + cpf + " | Endereço: " + endereco;
	}
}
