import java.util.Scanner;

public class Ex3 {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("CÁLCULO de DELTA\n");
		
		int[] nums = new int[3];
		
		System.out.print("Digite o valor de A: ");
		nums[0] = scan.nextInt();
		System.out.print("Digite o valor de B: ");
		nums[1] = scan.nextInt();
		System.out.print("Digite o valor de C: ");
		nums[2] = scan.nextInt();
				
		int delta = (nums[1]*nums[1])-4*nums[0]*nums[2];
		
		System.out.print("\n");
		System.out.println("Delta: "+delta);
		System.out.print("\n");
		
		if(delta > 0){
			System.out.println("A equação possui duas raizes reais.");
		}else if (delta == 0){
			System.out.println("A equação possui uma única raiz real.");
		}else{
			System.out.println("A equação não possui raizes reais.");
		}
		
	}
}
