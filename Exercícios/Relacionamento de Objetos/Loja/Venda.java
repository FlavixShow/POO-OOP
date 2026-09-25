public class Venda{
	private int numero;
	private Cliente comprador;
	private Produto produto;
	private int quantidade;
	
	public Venda(int numero, Cliente comprador, Produto produto, int quantidade){
		this.numero = numero;
		this.comprador = comprador;
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public String imprimir(){
		String info;
		info = "Nome do Comprador: " + comprador.getNome() + "\n";
		info += "Descrição do Produto: " + produto.getDescricao() + "\n";
		info += "Quantidade: " + quantidade + "\n";
		info += "Valor total: " + (produto.getPreco()*quantidade) + "\n";
		
		if(produto.getPreco()*quantidade <= comprador.getLimiteDeCredito()){
			info += "-Está Dentro do Limite de Crédito-";
		}else{
			info += "-Não Está Dentro do Limite de Crédito-";
		}
		
		return info;
	}
	
	public int getNumero(){
		return numero;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public Cliente getComprador(){
		return comprador;
	}
	public void setComprador(Cliente comprador){
		this.comprador = comprador;
	}
	
	public Produto getProduto(){
		return produto;
	}
	public void setProduto(Produto produto){
		this.produto = produto;
	}
	
	public int getQuantidade(){
		return quantidade;
	}
	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
}
