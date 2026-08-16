import java.util.Scanner;

public class Empresa {
	public static void main (String[] args){
		Funcionario [] funcionarios = new Funcionario[3];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++){
			funcionarios[i] = new Funcionario();
			
			System.out.print("Digite o nome do " + (i+1) + "º funcionário: ");
			funcionarios[i].nome = scan.nextLine();
			
			System.out.print("Digite as horas trabalhadas do " + (i+1) + "º funcionário: ");
			funcionarios[i].horasTrabalhadas = scan.nextInt();
			
			System.out.print("Digite o valor da hora do " + (i+1) + "º funcionário: ");
			funcionarios[i].valorHora = scan.nextDouble();
			
			System.out.print("\n");
			scan.nextLine();
		}
		
		for(int i = 0; i < 3; i++){
			System.out.println("\nNome: " + funcionarios[i].nome + " - Salário: " + funcionarios[i].salarioFinal());
		}
	}
}
