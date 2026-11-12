public class Main{
	public static void main(String[] args){
		DiaDosNamorados cartaoDiaDosNamo = new DiaDosNamorados("Destintário Namorados");
		Natal cartaoNatal = new Natal("Destinatário Natal");
		Aniversario cartaoAniversario = new Aniversario("Destinatario Aniversário");
		
		System.out.println(cartaoDiaDosNamo.showMessage());
		System.out.println(cartaoNatal.showMessage());
		System.out.println(cartaoAniversario.showMessage());
	}
}
