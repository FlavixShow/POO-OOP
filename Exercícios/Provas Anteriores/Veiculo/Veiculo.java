public class Veiculo{
	private String placa;
	private String modelo;
	private String tipo;
	private int quilometragem;
	
	public Veiculo(String placa, String modelo, String tipo){
		this.placa = placa;
		this.modelo = modelo;
		this.setTipo(tipo);
		this.quilometragem = 0;
	}
	
	public Veiculo(String placa, String modelo, String tipo, int quilometragem){
		this.placa = placa;
		this.modelo = modelo;
		this.setTipo(tipo);
		this.quilometragem = quilometragem;
	}
	
	public Double calcularLocacao(int dias){
		quilometragem += 100;
		Double locacao = 0.0;
		if(tipo.equalsIgnoreCase("ECONOMICO")){
			locacao = 100*dias + 0.1*100;
		}else if(tipo.equalsIgnoreCase("SUV")){
			locacao = 150*dias + 0.1*100;
		}else if(tipo.equalsIgnoreCase("LUXO")){
			locacao = 250*dias + 0.1*100;
		}
		return locacao;
	}
	
	public Double calcularLocacao(int dias, int kmRodados){
		quilometragem += kmRodados;
		Double locacao = 0.0;
		if(tipo.equalsIgnoreCase("ECONOMICO")){
			locacao = 100*dias + 0.1*kmRodados;
		}else if(tipo.equalsIgnoreCase("SUV")){
			locacao = 150*dias + 0.1*kmRodados;
		}else if(tipo.equalsIgnoreCase("LUXO")){
			locacao = 250*dias + 0.1*kmRodados;
		}
		return locacao;
	}
	
	public Double calcularLocacao(int dias, int kmRodados, boolean seguro){
		quilometragem += kmRodados;
		Double locacao = 0.0;
		if(tipo.equalsIgnoreCase("ECONOMICO")){
			locacao = 100*dias + 0.1*kmRodados;
		}else if(tipo.equalsIgnoreCase("SUV")){
			locacao = 150*dias + 0.1*kmRodados;
		}else if(tipo.equalsIgnoreCase("LUXO")){
			locacao = 250*dias + 0.1*kmRodados;
		}
		
		if(seguro){
			locacao += 50*dias;
		}
		
		return locacao;
	}
	
	private String valorPorDia(){
		if(tipo.equalsIgnoreCase("ECONOMICO")){
			return "R$ 100.00";
		}else if(tipo.equalsIgnoreCase("SUV")){
			return "R$ 150.00";
		}else if(tipo.equalsIgnoreCase("LUXO")){
			return "R$ 250.00";
		}
		return "";
	}
	
	public String exibirDetalhes(){
		return "Placa: " + placa + " | Modelo: " + modelo + " | Tipo: " + tipo +
			   " | Quilometragem: " + quilometragem + " | Valor por Dia: " + this.valorPorDia();
	}
	
	public String getPlaca(){
		return placa;
	}
	
	public void setPlaca(String placa){
		this.placa = placa;
	}
	
	public String getModelo(){
		return modelo;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public String getTipo(){
		return tipo;
	}
	public void setTipo(String tipo){
		if(tipo.equalsIgnoreCase("ECONOMICO") || tipo.equalsIgnoreCase("SUV") || tipo.equalsIgnoreCase("LUXO")){
			this.tipo = tipo;
		}
	}
	
	public int getQuilometragem(){
		return quilometragem;
	}
	public void setQuilometragem(int quilometragem){
		this.quilometragem = quilometragem;
	}
	
	
}
