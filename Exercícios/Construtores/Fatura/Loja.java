public class Loja{
	public static void main(String[] args){
		Fatura fatura1 = new Fatura(100, "Cabo USB", 2, 2);
		Fatura fatura2 = new Fatura(101, "Cabo USB", -2, -2); //Para testar o tratamento de valores negativos.
	
		System.out.println(fatura1.toString() + " - Valor da fatura: " + fatura1.getValorDaFatura());
		System.out.println(fatura2.toString() + " - Valor da fatura: " + fatura2.getValorDaFatura());
	}
}
