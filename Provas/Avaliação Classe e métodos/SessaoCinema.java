public class SessaoCinema{
	private int numeroDaSala;
	private String filme;
	private int capacidade;
	private int ingressosVendidos;
	private Double precoIngresso;
	
	//construtores
	public SessaoCinema(int numeroDaSala, String filme, int capacidade){
		this.numeroDaSala = numeroDaSala;
		this.filme  = filme;
		this.capacidade = capacidade;
		this.ingressosVendidos = 0;
		this.precoIngresso = 25.0;
	}
	
	public SessaoCinema(int numeroDaSala, String filme, int capacidade, Double precoIngresso){
		this.numeroDaSala = numeroDaSala;
		this.filme  = filme;
		this.capacidade = capacidade;
		this.ingressosVendidos = 0;
		this.precoIngresso = precoIngresso;
	}
	
	//metodos
	public Double venderIngresso(){
		if(ingressosVendidos >= capacidade){
			return -1.0;
		}
		
		ingressosVendidos++;
		
		return precoIngresso;
	}
	
	public Double venderIngresso(int quantidade){
		if((ingressosVendidos + quantidade) > capacidade){
			return -1.0;
		}
		
		ingressosVendidos += quantidade;
		
		return precoIngresso*quantidade;
	}
	
	public Double venderIngresso(int quantidade, boolean meiaEntrada){
		if((ingressosVendidos + quantidade) > capacidade){
			return -1.0;
		}
		
		ingressosVendidos += quantidade;

		if(meiaEntrada){
			return (precoIngresso * quantidade) * 0.5;
		}
		
		return precoIngresso * quantidade;
	}
	
	public Double calcularbilheteria(){
		return ingressosVendidos * precoIngresso;
	}
	
	public String exibirSessao(){
		return "Sala " + numeroDaSala + " - Filme: " + filme + " - Ingresso: R$" + precoIngresso;  
	}
	
	public String exibirSessao(boolean mostrarLotacao){
		if(mostrarLotacao){
			return "Sala " + numeroDaSala + " - Filme: " + filme + " - Ingresso: R$" + precoIngresso + " - Lotação: " + ingressosVendidos + "/" + capacidade;  
		}
		return exibirSessao();
	}
	
	//getters e setters
	public int getNumeroDaSala(){
		return numeroDaSala;
	}
	public void setNumeroDaSala(int numeroDaSala){
		this.numeroDaSala = numeroDaSala;
	}
	
	public String getFilme(){
		return filme;
	}
	public void setFilme(String filme){
		this.filme = filme;
	}
	
	public int getCapacidade(){
		return capacidade;
	}
	public void setCapacidade(int capacidade){
		this.capacidade = capacidade;
	}
	
	public int getIngressosVendidos(){
		return ingressosVendidos;
	}
	public void setIngressosVendidos(int ingressosVendidos){
		this.ingressosVendidos = ingressosVendidos;
	}
	
	public Double getPrecoIngresso(){
		return precoIngresso;
	}
	public void setPrecoIngresso(Double precoIngresso){
		this.precoIngresso = precoIngresso;
	}
}
