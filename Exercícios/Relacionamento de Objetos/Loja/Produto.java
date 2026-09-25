public class Produto{
	private int codigo;
	private String descricao;
	private Double custo;
	private Double preco;
	
	public Produto(int codigo, String descricao, Double custo){
		this.codigo = codigo;
		this.descricao = descricao;
		this.custo = custo;
		this.calculaPreco();
	}
	
	public void calculaPreco(){
		preco = custo * 1.25;
	}
	
	public int getCodigo(){
		return codigo;
	}
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public String getDescricao(){
		return descricao;
	}
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public Double getCusto(){
		return custo;
	}
	public void setCusto(Double custo){
		this.custo = custo;
		calculaPreco();
	}
	
	public Double getPreco(){
		return preco;
	}
}
