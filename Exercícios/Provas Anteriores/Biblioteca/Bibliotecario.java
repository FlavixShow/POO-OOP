public class Bibliotecario extends Funcionario{
	private String cargo;
	
	public Bibliotecario(int registro, String cargo, String nome, Double salario){
		super(nome, salario, registro);
		this.setCargo(cargo);
	}
	
	public String processaEmprestimo(String titulo){
		return "Empréstimo de " + titulo + " processado por " + cargo + ".";
	}
	
	
	@Override
	public Double calculaSalario(){
		Double salario = getSalario();
		if(cargo.equals("SENIOR")){
			salario *= 1.3;
		}
		if(cargo.equals("JUNIOR")){
			salario *= 1.1;
		}
		return salario * 0.9;
	}
	
	public String getCargo(){
		return cargo;
	}
	public void setCargo(String cargo){
		if(cargo.equals("JUNIOR") || cargo.equals("SENIOR")){
			this.cargo = cargo;
		}else{
			this.cargo = "";
		}
	}
}
