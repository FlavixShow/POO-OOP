public class Funcionario {
	String nome;
	int horasTrabalhadas;
	double valorHora;
	
	
	public double salarioFinal(){
		return (horasTrabalhadas * valorHora)*(1 - 0.11);
	}
}
