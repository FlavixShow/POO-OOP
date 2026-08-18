public class Classe{
	public static void main(String[] args){
		Aluno aluno1 = new Aluno(1000, "José", "123.456.789-01", "Rua X, Nº 42, Bairro Amanhecer");
		Aluno aluno2 = new Aluno(1001, "Maria", "987.654.321-10", "Rua Y, Nº 43, Bairro Entardecer");
		
		System.out.println(aluno1.toString());
		System.out.println(aluno2.toString());
	}
}
