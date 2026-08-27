import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Financeiro{
	public static void main(String[] args){
		Boleto [] boletos = new Boleto[100];
		
		Scanner scan = new Scanner(System.in);
		int cont = 0;
		do{
			System.out.println("======= FINANCEIRO =======");
			
			int esc;
			System.out.print("1 - Adicionar Boleto\n2 - Listar Boletos\n3 - Pagar Boleto\n0 - Sair\nEscolha: ");
			esc = scan.nextInt();
			scan.nextLine();
			
			if(esc == 1){
				String desc;
				int diaVenc;
				double valor;
				
				System.out.print("Digite a descrição do boleto: ");
				desc = scan.nextLine();
				System.out.print("Digite a data de vencimenoto do boleto: ");
				diaVenc = scan.nextInt();
				System.out.print("Digite o valor do boleto: ");
				valor = scan.nextDouble();
				
				boletos[cont] = new Boleto(cont, desc, diaVenc, valor);
				
				cont++;
				scan.nextLine();
			}else if(esc == 2){
				for(int i = 0; i < cont; i++){
					boletos[i].exibir();
				}
			}else if(esc == 3){
				int cod, dia, desconto;
				double valorPago;
				
				System.out.print("Digite código do boleto: ");
				cod = scan.nextInt();
				
				System.out.print("Digite dia de pagamento do boleto: ");
				dia = scan.nextInt();
				
				System.out.print("Digite o desconto: ");
				desconto = scan.nextInt();
				
				System.out.print("Digite o valor pago: ");
				valorPago = scan.nextDouble();
				
				boletos[cod].pagar(dia, desconto, valorPago);

				scan.nextLine();
			}else if(esc == 0){
				break;
			}else{
				System.out.println("Escolha Inválida.");	
			}
		}while(true);

	}
}
