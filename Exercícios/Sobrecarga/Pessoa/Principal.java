public class Principal{
	public static void main(String[] args){
		Pessoa pessoa1 = new Pessoa("jan");
		Pessoa pessoa2 = new Pessoa("Perpetva", "Feminino", 9, 2005);
		
		System.out.println(pessoa1.mostraIdade());
		System.out.println(pessoa1.mostraIdade(9, 2026));
		System.out.println(pessoa1.mostraIdade(1, 2026));

		System.out.println(pessoa2.mostraIdade());
		System.out.println(pessoa2.mostraIdade(10, 2026));
		System.out.println(pessoa2.mostraIdade(9, 2026));

	}
}
