public class Carro{
	private double combustivel;
	private double quilometragem;

	public Carro(int combustivel){
		this.setCombustivel(combustivel);
		quilometragem = 0.0;
	}
	
	public void percorrerDistancia(int distancia){
		if(autonomia() >= distancia){
			quilometragem += distancia;
			combustivel -= distancia/12;
		}else{
			System.out.println("Combustível Insuficiente");
		}
	}
	
	public void abastecer(double litros){
		combustivel += litros;
	}
	
	public double autonomia(){
		return combustivel*12;
	}
	
	public double getCombustivel(){
		return combustivel;
	}
	
	public void setCombustivel(int combustivel){
		if(combustivel >= 0){
			this.combustivel = combustivel;
		}else{
			System.out.println("Quantidade Inválida.");
		}
	}
	
	public double getQuilometragem(){
		return quilometragem;
	}
	
	public void setQuilometragem(int quilometros){
		if(quilometros >= 0){
			quilometragem = quilometros;
		}else{
			System.out.println("Valor Inválido.");
		}
	}
}
