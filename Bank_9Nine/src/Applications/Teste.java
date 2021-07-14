package Applications;

import java.util.Scanner;

import Entities.Banner;
import Entities.ContaCorrente;
import Entities.ContaGeral;
import Entities.ContaPoupanca;
import Entities.CreditoEspecial;
import Entities.EmprestimoEmpresa;
import Entities.EmprestimoEstudantil;

public class Teste {

	public static void main(String[] args) {
		int escolhaMenu;
		int limiteLoop = 10;
		String respCheque;
		
		Scanner leia = new Scanner (System.in);
		
		ContaPoupanca contaP = new ContaPoupanca("CONTA POUPANÇA", 001, 14);
		ContaCorrente contaC = new ContaCorrente("CONTA CORRENTE", 002);
		CreditoEspecial contaEs = new CreditoEspecial("CONTA ESPECIAL", 003);
		EmprestimoEmpresa contaEp = new EmprestimoEmpresa("CONTA EMPRESA", 004);
		EmprestimoEstudantil contaEt = new EmprestimoEstudantil("CONTA ESTUDANTE", 005);
		
		Banner b1 = new Banner("banner", 001);
		b1.banner();
		b1.mostraMenu();
		escolhaMenu = leia.nextInt();
					
		do {
			if (escolhaMenu == 1) {
				for (int i = 1; i <= limiteLoop; i++) {
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
					
					if (contaP.getRespostaRepeteSN().toLowerCase().equals("n")) {
						break;
					}
				}
				
				b1.mostraMenu();
				escolhaMenu = leia.nextInt();
				
			} else if (escolhaMenu == 2) {
				
				for (int i = 1; i <= limiteLoop; i++) {
					contaC.mostraHeader();
					contaC.mostraCredDeb();
					contaC.setEscolhaCredDeb(leia.nextInt());
					
					if(contaC.getEscolhaCredDeb() == 1) {
						System.out.println("Digite o valor desejado: ");
						contaC.creditar(leia.nextDouble());
					} else if (contaC.getEscolhaCredDeb() == 2) {
						System.out.println("Digite o valor desejado: ");
						contaC.debitar(leia.nextDouble());
					} else {
						System.out.println("Comando Inválido.");
					}
					
					if (contaC.getSaldo2() >= 30.00) {
						while (contaC.getCheque() <= 3 && contaC.getCheque() > 0) {
							
						System.out.println("Deseja solicitar um talão de cheques? S/N");
						respCheque = leia.next();
											
							if (respCheque.toLowerCase().equals("s")) {
								contaC.mostraCheque();
								break;
							} else if (respCheque.toLowerCase().equals("n")) {
								break;
							} else {
								System.out.println("Erro");
								break;
							}
						}
					}
					
					contaC.repeteOp();
					contaC.setRespostaRepeteSN(leia.next());
					
					if (contaC.getRespostaRepeteSN().toLowerCase().equals("n")) {
							break;
					}
				}
				b1.mostraMenu();
				escolhaMenu = leia.nextInt();
				
			} else if (escolhaMenu == 3) {
								
				for (int i = 1; i <= limiteLoop; i++) {
					contaEs.mostraHeader();
					contaEs.mostraCredDeb();
					contaEs.setEscolhaCredDeb(leia.nextInt());
					
					if(contaEs.getEscolhaCredDeb() == 1) {
						System.out.println("Digite o valor desejado: ");
						contaEs.creditar(leia.nextDouble());
					} else if (contaEs.getEscolhaCredDeb() == 2) {
						System.out.println("Digite o valor desejado: ");
						contaEs.debitar(leia.nextDouble());
						System.out.println(" ");
					} else {
						System.out.println("Comando Inválido.");
					}
					
					contaEs.repeteOp();
					contaEs.setRespostaRepeteSN(leia.next());
					
					
					if (contaEs.getRespostaRepeteSN().toLowerCase().equals("n")) {
						break;
					}
							
					}
					b1.mostraMenu();
					escolhaMenu = leia.nextInt();			
				
			} else if (escolhaMenu == 4) {
				double pedidoEmprestimoEmpresa;
				String respEmprestimo;
				
				
				for (int i = 1; i <= limiteLoop; i++) {
					contaEp.mostraHeader();
					contaEp.mostraCredDeb();
					contaEp.setEscolhaCredDeb(leia.nextInt());
					
					if(contaEp.getEscolhaCredDeb() == 1) {
						System.out.println("Digite o valor desejado: ");
						contaEp.creditar(leia.nextDouble());
					} else if (contaEp.getEscolhaCredDeb() == 2) {
						System.out.println("Digite o valor desejado: ");
						contaEp.debitar(leia.nextDouble());
						System.out.println(" ");
					} else {
						System.out.println("Comando Inválido.");
					}
					
					if(contaEp.getEmprestimoEmpresa() <= 10000 && contaEp.getEmprestimoEmpresa() > 0) {
						System.out.println("SALDO: R$ "+contaEp.getSaldo4());
						System.out.println("EMPRÉSTIMO DISPONÍVEL: R$"+contaEp.getEmprestimoEmpresa());
							System.out.println("Você gostaria de um empréstimo? S/N");
							respEmprestimo = leia.next();
							
							if(respEmprestimo.toLowerCase().equals("s")) {
								System.out.println("Valor do empréstimo: ");
								pedidoEmprestimoEmpresa = leia.nextDouble();
								contaEp.emprestimo(pedidoEmprestimoEmpresa);
							} else if (respEmprestimo.toLowerCase().equals("n")) {
								System.out.println(" ");
							} else {
								System.out.println("Comando inválido.");
							}
					}

					contaEp.repeteOp();
					contaEp.setRespostaRepeteSN(leia.next());
					
					if (contaEp.getRespostaRepeteSN().toLowerCase().equals("n")) {
						break;
					}	
						
				}
				b1.mostraMenu();
				escolhaMenu = leia.nextInt();
				
				
			} else if (escolhaMenu == 5) {
				double pedidoEmprestimoEstudante;
				String respEmprestimo;
				
				for (int i = 1; i <= limiteLoop; i++) {
					contaEt.mostraHeader();
					contaEt.mostraCredDeb();
					contaEt.setEscolhaCredDeb(leia.nextInt());
					
					if(contaEt.getEscolhaCredDeb() == 1) {
						System.out.println("Digite o valor desejado: ");
						contaEt.creditar(leia.nextDouble());
					} else if (contaEt.getEscolhaCredDeb() == 2) {
						System.out.println("Digite o valor desejado: ");
						contaEt.debitar(leia.nextDouble());
						System.out.println(" ");
					} else {
						System.out.println("Comando Inválido.");
					}
					
					if(contaEt.getEmprestimoEstudante() <= 10000 && contaEt.getEmprestimoEstudante() > 0) {
						System.out.println("SALDO: R$ "+contaEt.getSaldo5());
						System.out.println("EMPRÉSTIMO DISPONÍVEL: R$"+contaEt.getEmprestimoEstudante());
							System.out.println("Você gostaria de um empréstimo? S/N");
							respEmprestimo = leia.next();
							
							if(respEmprestimo.toLowerCase().equals("s")) {
								System.out.println("Valor do empréstimo: ");
								pedidoEmprestimoEstudante = leia.nextDouble();
								contaEt.emprestimo(pedidoEmprestimoEstudante);
							} else if (respEmprestimo.toLowerCase().equals("n")) {
								System.out.println(" ");
							} else {
								System.out.println("Comando inválido.");
							}
					}

					contaEt.repeteOp();
					contaEt.setRespostaRepeteSN(leia.next());
					
					if (contaEt.getRespostaRepeteSN().toLowerCase().equals("n")) {
						break;
					}								
				}	
				b1.mostraMenu();
				escolhaMenu = leia.nextInt();			
			} else if (escolhaMenu == 6) {
				System.out.println("OPERAÇÃO FINALIZADA.");
			} else {
				System.out.println("Operação inválida.");
			}
			
		} while (escolhaMenu != 6);
		
			


	}

}
