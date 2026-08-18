import java.util.Scanner;

public class Clinica{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		Paciente[] paciente = new Paciente[2];
		
		for(int i = 0; i < 2; i++){
			paciente[i] = new Paciente();
			System.out.print("Digite o nome do " + (i+1) + "º paciente: ");
			paciente[i].nome = scan.nextLine();
			System.out.print("Digite o sexo do " + (i+1) + "º paciente: ");
			paciente[i].sexo = scan.nextLine();
			System.out.print("Digite o peso do " + (i+1) + "º paciente: ");
			paciente[i].peso = scan.nextDouble();
			System.out.print("Digite a altura do " + (i+1) + "º paciente: ");
			paciente[i].altura = scan.nextDouble();
			scan.nextLine();
		}
		
		for(int i = 0; i < 2; i++){
			System.out.println("Nome: " + paciente[i].nome + " Sexo: " + paciente[i].sexo + " IMC: " + String.format("%.2f", paciente[i].calcularIMC()));
		}
	}
}
