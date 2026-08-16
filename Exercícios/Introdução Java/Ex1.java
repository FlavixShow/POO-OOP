import java.util.Scanner;

public class Ex1 {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int n1 = scan.nextInt();
		System.out.print("Digite o segundo número: ");
		int n2 = scan.nextInt();
		System.out.print("\n");
		if(n1>=n2){
			System.out.println("Diferença: "+(n1-n2));
		}else if(n2>n1){
			System.out.println("Diferença: "+(n2-n1));
		}
		
	}
}
