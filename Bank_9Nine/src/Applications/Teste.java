package Applications;

import java.util.Scanner;

import Entities.ContaGeral;
import Entities.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		int escolhaMenu;
		Scanner leia = new Scanner (System.in);
		
			System.out.println(" ");
			System.out.println("-------- BANK NINE9 ------");
			System.out.println("---ATRIBUINDO EXPOENTE----");
			System.out.println("-----AO SEU PATRIMÔNIO----");
			System.out.println("-----------MENU-----------");
			System.out.println("1 - Conta Poupança");
			System.out.println("2 - Conta Corrente");
			System.out.println("3 - Conta Especial");
			System.out.println("4 - Conta Empresa");
			System.out.println("5 - Conta Estudantil");
			System.out.println("6 - Sair");
			System.out.println("---------------------------");
			System.out.println("Digite a opção desejada: ");
			System.out.println(" ");
			escolhaMenu = leia.nextInt();
			
		
		do {
			if (escolhaMenu == 1) {
				ContaPoupanca contaP = new ContaPoupanca("CONTA POUPANÇA", 001, 14);
				
				for (int i = 1; i <= 10; i++) {
					contaP.mostraHeader();
					contaP.mostraCredDeb();
					contaP.setEscolhaCredDeb(leia.nextInt());
					
					if(contaP.getEscolhaCredDeb() == 1) {
						System.out.println("Digite o valor desejado: ");
						contaP.creditar(leia.nextDouble());
					} else if (contaP.getEscolhaCredDeb() == 2) {
						System.out.println("Digite o valor desejado: ");
						contaP.debitar(leia.nextDouble());
					} else {
						System.out.println("Comando Inválido.");
					}
					contaP.perguntarDia();
					contaP.setRespostaDia(leia.nextInt());
					contaP.ajustarPoupanca();
					
					contaP.repeteOp();
					contaP.setRespostaRepeteSN(leia.next());
					
					if (contaP.getRespostaRepeteSN().equals("N")) {
						break;
					}
					
				}
				
			} else if (escolhaMenu == 2) {
				
			} else if (escolhaMenu == 3) {
				
			} else if (escolhaMenu == 4) {
				
			} else if (escolhaMenu == 5) {
				
			} else if (escolhaMenu == 6) {
				System.out.println("OPERAÇÃO FINALIZADA.");
			} else {
				System.out.println("Operação inválida.");
			}
			
		} while (escolhaMenu != 6);
		


	}

}
