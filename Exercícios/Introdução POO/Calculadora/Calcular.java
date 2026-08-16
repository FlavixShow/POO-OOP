import java.util.Scanner;

public class Calcular {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		
		Calculadora calc = new Calculadora();
		
		System.out.println("-CALCULADORA-");
		System.out.print("Digite o primeiro valor: ");
		calc.n1 = scan.nextDouble(); 
		System.out.print("Digite o segundo valor: ");
		calc.n2 = scan.nextDouble();
		
		System.out.println("Soma: "+calc.somar()+"\nSubtração: "+calc.subtrair()+"\nMultiplicação: "+calc.multiplicar()+"\nDivisão: "+calc.dividir()); 
	}
}
