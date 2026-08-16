import java.util.Scanner;

public class FaixaValor {
	public static void main(String[] args) {
		System.out.print("Digite um número: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num>=1 && num<=9){
			System.out.println("O valor está dentro da faixa (1 a 9.)");
		}else{
			System.out.println("O valor está fora da faixa (1 a 9).");
		}
		
	}
}
