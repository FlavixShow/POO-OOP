import java.util.Scanner;

public class MaiorValor{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		double[] nums = new double[3];
		
		System.out.println("Digite os valores: ");
		for(int i = 0; i < 3; i++){
			nums[i] = scan.nextDouble();
		}
		
		System.out.print("Maior: ");
		if(nums[0]>=nums[1] && nums[0]>=nums[2]){
			System.out.print(nums[0]);
		}else if(nums[1]>=nums[0] && nums[1]>=nums[2]){
			System.out.print(nums[1]);
		}else{
			System.out.print(nums[2]);
		}
	}
}
