public class Auxiliar extends Funcionario{
	private String setor;
	
	public Auxiliar(int registro, String setor, String nome, Double salario){
		super(nome, salario, registro);
		this.setSetor(setor);
	}
	
	public String organizaLivros(String genero){
		return "Livros de " + genero + " organizados no " + setor + ".";
	}
	
	@Override
	public Double calculaSalario(){
		Double salario = getSalario();
		if(setor.equals("ACERVO")){
			salario *= 1.15;
		}
		if(setor.equals("LIMPEZA")){
			salario *= 1.05;
		}
		return salario * 0.9;
	}
	
	public String getSetor(){
		return setor;
	}
	public void setSetor(String setor){
		if(setor.equals("ACERVO") || setor.equals("LIMPEZA")){
			this.setor = setor;
		}else{
			this.setor = "";
		}
	}
}
