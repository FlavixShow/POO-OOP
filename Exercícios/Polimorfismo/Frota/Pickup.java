public class Pickup extends Carro{
	private int capacidadeCarga;
	private int pesoCarga;
	
	
	public Pickup(int passageiros, int combustivel, Double rendimento, boolean cambioAutomatico, int capacidadeCarga, int pesoCarga){
		super(passageiros, combustivel, rendimento, cambioAutomatico);
		this.capacidadeCarga = capacidadeCarga;
		this.setPesoCarga(pesoCarga);
	}
	
	
	@Override
	public Double autonomia(){
		Double autonomia = getCombustivel() * getRendimento() * 1.0;
		if((capacidadeCarga - pesoCarga) == 0){
			autonomia *= 0.5;
		}else if((capacidadeCarga - pesoCarga) < capacidadeCarga){
			autonomia *= 0.75;
		}
		
		if(isCambioAutomatico()){
			autonomia *= 0.9;
		}
		return autonomia;
	}
	
	
	public int getCapacidadeCarga(){
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(int capacidadeCarga){
		this.capacidadeCarga = capacidadeCarga;
	}
	
	public int getPesoCarga(){
		return pesoCarga;
	}
	public void setPesoCarga(int pesoCarga){
		if(pesoCarga <= capacidadeCarga){
			this.pesoCarga = pesoCarga;
		}
	}
}
