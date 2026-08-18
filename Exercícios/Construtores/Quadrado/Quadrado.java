public class Quadrado{
	double lado;
	
	public Quadrado(double novoLado){
		lado = novoLado;
	}
	
	public double calculaArea(){
		return lado*lado;
	}	
	
	public double calculaPerimetro(){
		return lado*4;
	}
}
