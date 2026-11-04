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
		Double salarioC = this.getSalario();
		if(cargo.equalsIgnoreCase("SENIOR")){
			salarioC *= 1.3;
		}
		if(cargo.equalsIgnoreCase("JUNIOR")){
			salarioC *= 1.1;
		}
		return salarioC * 0.9;
	}
	
	public String getCargo(){
		return cargo;
	}
	public void setCargo(String cargo){
		if(cargo.equalsIgnoreCase("JUNIOR") || cargo.equalsIgnoreCase("SENIOR")){
			this.cargo = cargo;
		}else{
			this.cargo = "";
		}
	}
}
