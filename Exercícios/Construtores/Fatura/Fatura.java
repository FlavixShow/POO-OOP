public class Fatura{
	int numero;
	String descricao;
	int quantidade;
	double preco;
	
	public Fatura(int novoNumero, String novaDescricao, int novaQuantidade, double novoPreco){
		numero = novoNumero;
		descricao = novaDescricao;
		quantidade = novaQuantidade;
		if(quantidade < 0){
			quantidade = 0;
		}
		preco = novoPreco;
		if(preco < 0){
			preco = 0.0;
		}
	}
	
	public double getValorDaFatura(){
		return quantidade*preco;
	}
	
	public String toString(){
		return "Número: " + numero + " | Descrição: " + descricao + " | Quantidade: " + quantidade + " | Preço: " + preco;
	}
}
