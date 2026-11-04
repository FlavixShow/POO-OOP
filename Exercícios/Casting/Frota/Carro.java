public class Carro extends Veiculo{
	private boolean cambioAutomatico;
	
	public Carro(int passageiros, int combustivel, Double rendimento, boolean cambioAutomatico){
		super(passageiros, combustivel, rendimento);
		this.cambioAutomatico = cambioAutomatico;
	}
	
	
	@Override
	public Double autonomia(){
		Double autonomia = super.autonomia();
		if(cambioAutomatico){
			return autonomia * 0.75;
		}
		return autonomia;
	}
	
	
	public boolean isCambioAutomatico(){
		return cambioAutomatico;
	}
	public void setCambioAutomatico(boolean cambioAutomatico){
		this.cambioAutomatico = cambioAutomatico;
	}
}
