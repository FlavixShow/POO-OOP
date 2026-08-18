public class Aluno{
	String nome;
	double nota1, nota2;
	
	public double media(){
		return (nota1+nota2)/2;
	}
	
	public String resultado(double media){
		String resultado;
		
		if(media >= 6){
			resultado = "APROVADO";
		}else{
			resultado = "REPROVADO";
		}
		return nome + " " + resultado;
	}
}
