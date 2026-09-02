public class Carro{
	private double combustivel;
	
	public Carro(){
		combustivel = 0.0;
	}
	
	public Carro(double combustivel){
		this.combustivel = combustivel;
	}
	
	public double autonomia(){
		return autonomia("gasolina");
	}
	
	public double autonomia(String tipoCombustivel){
		if(tipoCombustivel == "gasolina"){
			return combustivel*12;
		}else if(tipoCombustivel == "alcool"){
			return combustivel*8;
		}
		return 0.0;
	}
	
	public double autonomia(String tipoCombustivel, double abastecimento){
		combustivel += abastecimento;
		
		return autonomia(tipoCombustivel);
	}
	
	public double autonomia(String tipoCombustivel, boolean carga){
		double autonomia = autonomia(tipoCombustivel);
		
		if(carga == true){
			autonomia *= 0.7;
		}
		
		return autonomia;
	}
}
