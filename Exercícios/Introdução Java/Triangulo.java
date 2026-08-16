import java.util.Scanner;

public class Triangulo {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		float a,b,c;
		
		System.out.print("Primeiro Número: ");
		a = scan.nextFloat();
		System.out.print("Segundo Número: ");
		b = scan.nextFloat();
		System.out.print("Terceiro Número: ");
		c = scan.nextFloat();
	
		if(a+b > c && a+c > b && c+b > a){
			System.out.print("É um triângulo possível.");
		}else{
			System.out.print("Não é um triângulo possível.");
		}
	}
}
