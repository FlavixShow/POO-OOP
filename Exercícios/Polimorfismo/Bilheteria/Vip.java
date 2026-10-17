public class Vip extends Ingresso{
	private Double adicional;
	
	
	public Vip(Double valor, Double adicional){
		super(valor);
		this.adicional = adicional;
	}
	
	
	@Override
	public String mostraValor(){
		Double total = getValor() + adicional;
		return total.toString();
	}
	
	
	public Double getAdicional(){
		return adicional;
	}
	public void setAdicional(Double adicional){
		this.adicional = adicional;
	}
}
