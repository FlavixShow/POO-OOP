public class CamaroteSuperior extends Vip{
	public char classe;
	
	
	public CamaroteSuperior(Double valor, Double adicional, char classe){
		super(valor, adicional);
		this.classe = classe;
	}
	
	
	@Override
	public String mostraValor(){
		Double strValor = getValor() + getAdicional();
		if(classe == 'A'){
			strValor *= 1.75;
		}else if(classe == 'B'){
			strValor *= 1.5;
		}
		return strValor.toString();
	}
	
	
	public char getClasse(){
		return classe;
	}
	public void setClasse(char classe){
		this.classe = classe;
	}
}
