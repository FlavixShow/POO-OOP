public class Normal extends Ingresso{
	private boolean pista;
	
	
	public Normal(Double valor, boolean pista){
		super(valor);
		this.pista = pista;
	}
	
	
	@Override
	public String mostraValor(){
		Double strValor;
		if(pista){
			strValor = getValor()*1.1;
			return strValor.toString();
		}
		return getValor().toString();
		
		}	
	
	public boolean isPista(){
		return pista;
	}
	public void setPista(boolean pista){
		this.pista = pista;
	}
}
