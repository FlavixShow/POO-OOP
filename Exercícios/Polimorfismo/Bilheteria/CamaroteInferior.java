public class CamaroteInferior extends Vip{
	private String localizacao;
	
	
	public CamaroteInferior(Double valor, Double adicional, String localizacao){
		super(valor, adicional);
		this.localizacao = localizacao;
	}
	
	
	@Override
	public String mostraValor(){
		Double strValor = getValor() + getAdicional();
		if(localizacao.equalsIgnoreCase("lateral")){
			strValor *= 1.2;
		}else if(localizacao.equalsIgnoreCase("frontal")){
			strValor *= 1.35;
		}
		
		return strValor.toString();
	}
	
	
	public String getLocalizacao(){
		return localizacao;
	}
	public void setLocalizacao(String localizacao){
		this.localizacao = localizacao;
	}
}
