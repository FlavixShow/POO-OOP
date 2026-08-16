import java.util.Scanner;

public class Aula {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome completo: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Nome: "+nome+" Idade: "+idade);
	}
}
