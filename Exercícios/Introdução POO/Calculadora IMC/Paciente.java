public class Paciente{
	String nome, sexo;
	double peso, altura;
	
	public double calcularIMC(){
		return peso/(altura*altura);
	}
}
