public class Loja{
	public static void main(String[] args){
		Cliente cliente = new Cliente("Flávio", "123.456.789-01", 7000.00);
		Produto produto = new Produto(9999, "Produto Caro Porque Sou Foda", 6000.00);
		
		Venda venda = new Venda(0, cliente, produto, 2);
		
		System.out.println("-DADOS DA VENDA-\n");
		System.out.println(venda.imprimir());
		System.out.println("Limite de Crédito: " + venda.getComprador().getLimiteDeCredito() + "\n\n");


		Venda venda2 = new Venda(0, cliente, produto, 3);
		
		System.out.println("-DADOS DA VENDA-\n");
		System.out.println(venda2.imprimir());
		System.out.println("Limite de Crédito: " + venda2.getComprador().getLimiteDeCredito() + "\n\n");
	}
}
