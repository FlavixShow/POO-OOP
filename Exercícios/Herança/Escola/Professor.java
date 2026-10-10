public class Professor extends Pessoa{
	private String disciplina;
	private Double valorHoraAula;
	private int quantidadeHoras;
	
	
	public Professor(String nome, String cpf, String telefone, String disciplina, Double valorHoraAula, int quantidadeHoras){
		super(nome, cpf, telefone);
		this.disciplina = disciplina;
		this.valorHoraAula = valorHoraAula;
		this.quantidadeHoras = quantidadeHoras;
	}
	
	
	public Double calcularPagamento(){
		return valorHoraAula*quantidadeHoras;
	}
	
	
	public String getDisciplina(){
		return disciplina;
	}
	public void setDisciplina(String disciplina){
		this.disciplina = disciplina;
	}
	
	public Double getValorHoraAula(){
		return valorHoraAula;
	}
	public void setValorHoraAula(Double valorHoraAula){
		this.valorHoraAula = valorHoraAula;
	}
	
	public int getQuantidadeHoras(){
		return quantidadeHoras;
	}
	public void setQuantidadeHoras(int quantidadeHoras){
		this.quantidadeHoras = quantidadeHoras;
	}
	
	
}
