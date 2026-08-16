import java.util.Scanner;

public class MediaPonderada{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		float trabLab, avalSem, examFin, media;
		do{
			System.out.print("Digite a nota do Trabalho de Laboratório: ");
			trabLab = scan.nextFloat();
			if(trabLab < 0 || trabLab > 10){
				System.out.println("Entrada Inválida.");
			}
		}while(trabLab < 0 || trabLab > 10);
		do{
			System.out.print("Digite a nota da Avaliação Semestral: ");
			avalSem = scan.nextFloat();
			if(avalSem < 0 || avalSem > 10){
				System.out.println("Entrada Inválida.");
			}
		}while(avalSem < 0 || avalSem > 10);
		do{
			System.out.print("Digite a nota do Exame Final: ");
			examFin = scan.nextFloat();
			if(examFin < 0 || examFin > 10){
				System.out.println("Entrada Inválida");
			}
		}while(examFin < 0 || examFin > 10);
		
		media = ((trabLab*2)+(avalSem*3)+(examFin*5))/(2+3+5);
		
		5System.out.print("Média: " + media + " | Conceito: ");
		
		if(media >= 8 && media <= 10){
			System.out.print("A");
		}else if(media >= 7 && media < 8){
			System.out.print("B");
		}else if(media >= 6 && media < 7){
			System.out.print("C");
		}else if(media >= 5 && media < 6){
			System.out.print("D");
		}else{
			System.out.print("E");
		}
	}
}
