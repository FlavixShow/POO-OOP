public class Funcionario{
	private String nome;
	private double salarioBase;
	private int tempoDeServico;
	
	public Funcionario(String nome, double salarioBase, int tempoDeServico){
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.tempoDeServico = tempoDeServico;
	}
	
	public double mostraSalario(){
		if(tempoDeServico < 10){
			return salarioBase*1.12;
		}
		return salarioBase*1.17;
	}
	
	public double mostraSalario(double totalDeVendas){
		if(tempoDeServico < 10){
			return salarioBase*1.05 + totalDeVendas*0.015;
		}
		return salarioBase*1.10 + totalDeVendas*0.02;
	}
	
	public String getNome(){
		return nome;
	}
}
