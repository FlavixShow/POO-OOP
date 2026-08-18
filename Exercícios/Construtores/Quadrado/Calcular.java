import java.util.Scanner;

public class Calcular{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do lado do 1º quadrado: ");
		Quadrado q1 = new Quadrado(scan.nextDouble());
		System.out.print("Digite o valor do lado do 2º quadrado: ");
		Quadrado q2 = new Quadrado(scan.nextDouble());
		
		System.out.printf("1º Quadrado - Área: %.2f | Perímetro: %.2f\n", q1.calculaArea(), q1.calculaPerimetro());
		System.out.printf("2º Quadrado - Área: %.2f | Perímetro: %.2f", q2.calculaArea(), q2.calculaPerimetro());
	}
}
