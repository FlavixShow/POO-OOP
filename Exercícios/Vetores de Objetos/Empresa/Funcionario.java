public class Funcionario{
	private int matricula;
	private String nome;
	private int departamento;
	private Double salario;
	private String funcao;
	
	public Funcionario(int matricula, String nome, int departamento, Double salario, String funcao){
		this.matricula = matricula;
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.funcao = funcao;
	}
	
	public int getMatricula(){
		return matricula;
	}
	public String getNome(){
		return nome;
	}
	public int getDepartamento(){
		return departamento;
	}
	
	public Double getSalario(){
		return salario;
	}
	
	public String getFuncao(){
		return funcao;
	}
}
