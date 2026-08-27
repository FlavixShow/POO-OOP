public class Aluno{
	private String nome;
	private int matricula;
	private double media;
	private String situacao;
	
	
	public Aluno(String nome, int matricula, double media){
		this.nome = nome;
		this.matricula = matricula;
		this.setMedia(media);
	}
	
	
	private void verificaSituacao(){
		if(media >= 6){
			situacao = "APROVADO";
		}else{
			situacao = "REPROVADO";
		}
	}
	
	public String resultadoFinal(){
		return "Matrícula: " + matricula + " | Nome: " + nome + " | Situação: " + situacao;
	}
	
	// gets e sets
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public int getMatricula(){
		return matricula;
	}
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	public double getMedia(){
		return media;
	}
	public void setMedia(double media){
		this.media = media;
		verificaSituacao();
	}
}
