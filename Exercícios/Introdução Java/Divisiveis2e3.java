import java.util.Scanner;

public class Divisiveis2e3 {
	public static void main (String[] args){
		Scanner scan =  new Scanner(System.in);
		
		int[] nums =  new int[4];
		
		System.out.println("Digite os números: ");
		for(int i = 0; i < 4; i++){
			nums[i] = scan.nextInt();
		}
		
		System.out.print("Números divisíveis por 2 e 3: ");
		for(int i = 0; i < 4; i++){
			if(nums[i]%2 == 0 && nums[i]%3 == 0)
				System.out.print(nums[i] + " ");
		}
	}
}
