public class Boleto{
	private int codigo;
	private String descricao;
	private int diaDeVencimento;
	private double valor;
	private boolean status;
	
	public Boleto(int codigo, String descricao, int diaDeVencimento, double valor){
		this.codigo = codigo;
		this.descricao = descricao;
		this.diaDeVencimento = diaDeVencimento;
		this.valor = valor;
		status = false;
	}
	
	public void pagar(int dia, double desconto, double valorPago){
		if(status == true){
			System.out.println("Boleto Já Pago.\n");
			return;
		}
		
		double valorAlterado = valor;
		if(dia >= diaDeVencimento){
			valorAlterado *= 1.1;
		}else{
			valorAlterado *= 1 - desconto/100;
		}
		
		if(valorPago >= valorAlterado){
			status = true;
		}else{
			System.out.println("Valor Insuficiente.\n");
		}
	}
	
	public void exibir(){
		System.out.printf("Código: %d | Descrição: %s | Dia de Vencimento: %d | Valor: %.2f | Status: %s\n", codigo, descricao, diaDeVencimento, valor, status == true ? "PAGO" : "NÃO PAGO");
	}
}
