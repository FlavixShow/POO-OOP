public class Ingresso{
	private Double valor;
	
	
	public Ingresso(Double valor){
		this.valor = valor;
	}
	
	
	public String mostraValor(){
		return valor.toString();
	}
	
	
	public Double getValor(){
		return valor;
	}
	public void setValor(Double valor){
		this.valor = valor;
	}
}
