import java.util.Scanner;

public class Turma{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		Aluno[] aluno = new Aluno[2];
		
		for(int i = 0; i < 2; i++){
			aluno[i] = new Aluno();
			
			System.out.print("Digite o nome do "+ (i+1) +"º aluno: ");
			aluno[i].nome = scan.nextLine();

			System.out.print("Digite a primeira nota do aluno: ");
			aluno[i].nota1 = scan.nextDouble();
			
			System.out.print("Digite a segunda nota do aluno: ");
			aluno[i].nota2 = scan.nextDouble();
			
			scan.nextLine();
		}
		
		for(int i = 0; i < 2; i++){	
			System.out.println(aluno[i].resultado(aluno[i].media()) + " Média: " + aluno[i].media());

		}
		
	}
}
