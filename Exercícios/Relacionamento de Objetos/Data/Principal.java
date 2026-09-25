public class Principal{
	public static void main(String[] args){
		Pessoa p1 = new Pessoa("Perpetva");
		Pessoa p2 = new Pessoa("Flávio", "Macaco", new Data(26, 9, 2005));
		
		Data hoje = new Data(25, 9, 2026);
		
		System.out.println("Data: " + p1.getData().retornaData() + " | Idade: " + p1.mostraIdade(hoje));
		System.out.println("Data: " + p2.getData().retornaData() + " | Idade: " + p2.mostraIdade(hoje));
		
		System.out.println("Diferença: " + p2.getData().calculaTempo(p1.getData()));
	}
}
