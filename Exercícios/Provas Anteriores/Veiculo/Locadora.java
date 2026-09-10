import java.util.Scanner;

public class Locadora{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		Veiculo v1 = new Veiculo("ABC123", "Celta", "ECONOMICO");
		Veiculo v2 = new Veiculo("DEF456", "HR-V", "SUV", 100);
		Veiculo v3 = new Veiculo("GHI789", "CLK-320", "LUXO");
		
		int dias = 0;
		int escVei = 0;
		int quilometragem = 0;
		boolean loop = true;
		do{
			System.out.println("================================ LOCADORA ================================\n");
			System.out.println("-VEICULOS-\n");
			System.out.println("1 - " + v1.exibirDetalhes());
			System.out.println("2 - " + v2.exibirDetalhes());
			System.out.println("3 - " + v3.exibirDetalhes());
			
			System.out.println("-MENU-\n");
			System.out.println("1 - Calcular Locação (Dias)");
			System.out.println("2 - Calcular Locação (Dias e Km)");
			System.out.println("3 - Calcular Locação (Dias, Km e Seguro)");
			System.out.println("0 - Sair");
			System.out.print("Escolha: ");
			int esc = scan.nextInt();
			
			switch(esc){
				case 0: loop = false;
						break;
					
				case 1:	System.out.print("Escolha o Veículo: ");
						escVei = scan.nextInt();
						System.out.print("Digite os Dias: ");
						dias = scan.nextInt();
						
						System.out.println("");
						if(escVei == 1){
							System.out.printf("Valor: %.2f\n\n", v1.calcularLocacao(dias));
						}else if(escVei == 2){
							System.out.printf("Valor: %.2f\n\n", v2.calcularLocacao(dias));
						}else if(escVei == 3){
							System.out.printf("Valor: %.2f\n\n", v3.calcularLocacao(dias));
						}else{
							System.out.printf("Veículo não encontrado");
						}
						break;
						
				case 2: System.out.print("Escolha o Veículo: ");
						escVei = scan.nextInt();
						System.out.print("Digite os Dias: ");
						dias = scan.nextInt();
						System.out.print("Digite a quilometragem: ");
						quilometragem = scan.nextInt();
						
						System.out.println("");
						if(escVei == 1){
							System.out.printf("Valor: %.2f\n\n", v1.calcularLocacao(dias, quilometragem));
						}else if(escVei == 2){
							System.out.printf("Valor: %.2f\n\n", v2.calcularLocacao(dias, quilometragem));
						}else if(escVei == 3){
							System.out.printf("Valor: %.2f\n\n", v3.calcularLocacao(dias, quilometragem));
						}else{
							System.out.printf("Veículo não encontrado");
						}
						break;
						
				case 3: System.out.print("Escolha o Veículo: ");
						escVei = scan.nextInt();
						System.out.print("Digite os Dias: ");
						dias = scan.nextInt();
						System.out.print("Digite a quilometragem: ");
						quilometragem = scan.nextInt();
						System.out.print("Aceitas Seguro? (S/N)");
						scan.nextLine();
						boolean seguro = scan.nextLine().equalsIgnoreCase("S");
						
						System.out.println("");
						if(escVei == 1){
							System.out.printf("Valor: %.2f\n\n", v1.calcularLocacao(dias, quilometragem, seguro));
						}else if(escVei == 2){
							System.out.printf("Valor: %.2f\n\n", v2.calcularLocacao(dias, quilometragem, seguro));
						}else if(escVei == 3){
							System.out.printf("Valor: %.2f\n\n", v3.calcularLocacao(dias, quilometragem, seguro));
						}else{
							System.out.printf("Veículo não encontrado");
						}
						break;
						
				default: System.out.println("Entrada Inválida");
						 break;
				
			}
			
		}while(loop);
		
		System.out.println("\n\nFIM DO PROGRAMA");
	}
}
