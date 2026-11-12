public class Empresa{
	public static void main(String[] args){
		Fornecedor fornecedor = new Fornecedor("Fornecedor", "Endereço do Fornecedor", "(11)1111-1111", 100.0, 30.0);
		Administrador admin = new Administrador("Admin", "Endereço do Admin", "(22)2222-2222", 1, 1000.0, 100.0, 200.0);
		Operario opera = new Operario("Operário", "Endereço do Admin", "(22)2222-2222", 1, 1000.0, 100.0, 200.0, 10.0);
		Vendedor vend = new Vendedor("Vendedor", "Endereço do Admin", "(22)2222-2222", 1, 1000.0, 100.0, 200.0, 10.0);
		
		System.out.println(fornecedor.getNome() + " - " + fornecedor.obterSaldo());
		System.out.println(admin.getNome() + " - " + admin.calculaSalario());
		System.out.println(opera.getNome() + " - " + opera.calculaSalario());
		System.out.println(vend.getNome() + " - " + vend.calculaSalario());
	}
}
