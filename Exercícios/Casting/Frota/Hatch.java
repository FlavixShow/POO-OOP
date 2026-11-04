public class Hatch extends Carro{
	private int bagageiro;
	
	public Hatch(int passageiros, int combustivel, Double rendimento, boolean cambioAutomatico, int bagageiro){
		super(passageiros, combustivel, rendimento, cambioAutomatico);
		this.bagageiro = bagageiro;
	}
	
	
	public Double calculaVolume(){
		if(getPassageiros() < 3){
			return bagageiro * 2.0;
		}else if(getPassageiros() == 3){
			return bagageiro * 1.5;
		}
		return bagageiro * 1.0;
	}
	
	
	public int getBagageiro(){
		return bagageiro;
	}
	public void setBagageiro(int bagageiro){
		this.bagageiro = bagageiro;
	}
}
