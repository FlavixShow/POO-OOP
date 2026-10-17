public class Carro extends Veiculo{
	private boolean cambioAutomatico;
	
	public Carro(int passageiros, int combustivel, Double rendimento, boolean cambioAutomatico){
		super(passageiros, combustivel, rendimento);
		this.cambioAutomatico = cambioAutomatico;
	}
	
	
	@Override
	public Double autonomia(){
		if(cambioAutomatico){
			return (getCombustivel() * getRendimento()) * 0.9;
		}
		return getCombustivel() * getRendimento();
	}
	
	
	public boolean isCambioAutomatico(){
		return cambioAutomatico;
	}
	public void setCambioAutomatico(boolean cambioAutomatico){
		this.cambioAutomatico = cambioAutomatico;
	}
}
