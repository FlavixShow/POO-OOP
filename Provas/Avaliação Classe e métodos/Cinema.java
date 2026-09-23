import java.util.Scanner;

public class Cinema{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		SessaoCinema sessao = new SessaoCinema(14, "O Bom, o Mal e o Feio", 50, 30.0);
		
		boolean loop = true;
		int quantidade = 0;
		Double valor = 0.0;
		do{
			System.out.println("\n========================== CINEMA ==========================\n");
			System.out.println("-MENU-");
			System.out.println("1 - Vender Ingresso (sem parâmetros)");
			System.out.println("2 - Vender Ingresso (com quantidade)");
			System.out.println("3 - Vender Ingresso (com quantidade e meia entrada)");
			System.out.println("4 - Calcular Bilheteria");
			System.out.println("5 - Exibir Sessão (sem parâmetros)");
			System.out.println("6 - Exibir Sessão (com ou sem lotação)");
			System.out.println("0 - Sair");
			System.out.print("Escolha: ");
			int esc = scan.nextInt();
			
			switch(esc){
				case 0: loop = false;
						break;
						
				case 1: if(sessao.venderIngresso() == -1.0){
							System.out.println("Sala Cheia\n");
						}else{
							System.out.printf("Ingresso Vendido. Valor: %.2f\n", sessao.getPrecoIngresso());
						}
						break;
				
				case 2: System.out.printf("Digite a quantidade: ");
						quantidade = scan.nextInt();
						valor = sessao.venderIngresso(quantidade);
						
						if(valor == -1.0){
							System.out.println("Sala Cheia\n");
						}else{
							System.out.printf("Ingresso(s) Vendido(s). Valor: %.2f\n", valor);
						}
						break;
						
				case 3: System.out.printf("Digite a quantidade: ");
						quantidade = scan.nextInt();
						System.out.printf("Meia Entrada? (S/N)");
						scan.nextLine();
						boolean meiaEntrada = scan.nextLine().equalsIgnoreCase("S");
						
						valor = sessao.venderIngresso(quantidade, meiaEntrada);
						if(valor == -1.0){
							System.out.println("Sala Cheia\n");
							break;
						}else{
							System.out.printf("Ingresso(s) Vendido(s). Valor: %.2f\n", valor);
						}
						break;

				case 4:	System.out.printf("Bilheteria Bruta: %.2f\n", sessao.calcularbilheteria());
						break;
						
				case 5:	System.out.println(sessao.exibirSessao() + "\n");
						break;
						
				case 6: System.out.print("Exibir Lotação? (S/N)");
						scan.nextLine();
						boolean lotacao = scan.nextLine().equalsIgnoreCase("S");
						System.out.println(sessao.exibirSessao(lotacao) + "\n");
						break;
						
				default:System.out.println("Ação Inválida.\n");  
						break;
			}
		}while(loop);
		
		System.out.println("\n");
		System.out.println("=FIM DO PROGRAMA=");
	}
}
