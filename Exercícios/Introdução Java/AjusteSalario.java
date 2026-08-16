import java.util.Scanner;

public class AjusteSalario{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		float salario;
		
		System.out.print("Digite o salário do funcionário: ");
		salario = scan.nextFloat(); 

		if(salario < 5000){
			salario *= 1.3;
		}
		
		System.out.print(salario);
	}
}
