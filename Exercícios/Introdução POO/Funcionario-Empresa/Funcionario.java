public class Funcionario {
	String nome = "t";
	int horasTrabalhadas = 0;
	double valorHora = 0.0;
	
	
	public double salarioFinal(){
		return (horasTrabalhadas * valorHora)*(1 - 0.11);
	}
}
