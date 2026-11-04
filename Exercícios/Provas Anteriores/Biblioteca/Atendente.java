public class Atendente extends Funcionario{
	private String turno;
	
	public Atendente(int registro, String turno, String nome, Double salario){
		super(nome, salario, registro);
		this.setTurno(turno);
	}
	
	
	public String atenderUsuario(String nomeUsuario){
		return "Usurário " + nomeUsuario + "  atendido no turno " + turno + ".";
	}
	
	
	@Override
	public Double calculaSalario(){
		Double salario = getSalario();
		
		if(turno.equals("NOITE")){
			salario *= 1.2;
		}
		return salario * 0.9;
	}
	
	public String getTurno(){
		return turno;
	}
	public void setTurno(String turno){
		if(turno.equals("MANHA") || turno.equals("NOITE")){
			this.turno = turno;
		}else{
			this.turno = "";
		}
	}
}
