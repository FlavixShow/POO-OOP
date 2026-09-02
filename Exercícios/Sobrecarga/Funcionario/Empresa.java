public class Empresa{
	public static void main(String[] args){
		Funcionario f1 = new Funcionario("Maria", 2000, 9);
		Funcionario f2 = new Funcionario("José", 3000, 9);
		
		System.out.printf("Nome: %s | Salário: %.2f\n", f1.getNome(), f1.mostraSalario());
		System.out.printf("Nome: %s | Salário: %.2f", f2.getNome(), f2.mostraSalario(1000));
	}
}
