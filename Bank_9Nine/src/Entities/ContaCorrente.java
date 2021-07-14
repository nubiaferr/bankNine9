package Entities;

public class ContaCorrente extends ContaGeral {
	protected double saldo2;
	private int cheque = 3;
	
	public ContaCorrente(String tipo, int numero) {
		super(tipo, numero);
	}

	public double getSaldo2() {
		return saldo2;
	}

	public void setSaldo2(double saldo2) {
		this.saldo2 = saldo2;
	}

	public int getCheque() {
		return cheque;
	}

	public void setCheque(int cheque) {
		this.cheque = cheque;
	}
	
	@Override
	public void mostraHeader() {
		System.out.println(" ");
		System.out.println("Conta: "+this.getNumero()+" - BANK NINE9");
		System.out.println(this.getTipo());
		System.out.println("-----------------------");
		System.out.println("SALDO: R$ "+this.getSaldo2());
	}
	
	@Override
	public void mostraCredDeb(){
		System.out.println(" ");
		System.out.println("-----------------------");
		System.out.println("1 - Cr�dito");
		System.out.println("2 - D�bito");
		System.out.println("-----------------------");
		System.out.println("Digite a op��o desejada: ");
	}
	
	@Override
	public void creditar(double valor) {
		if (valor <= 0) {
			System.out.println("Insira um valor v�lido.");
		} else {
			this.setSaldo2(getSaldo2()+valor);
			System.out.println("Cr�dito no valor R$ "+valor+" feito com sucesso.");
		}
	}
	
	@Override
	public void debitar(double valor) {
		if (valor <= 0) {
			System.out.println("Insira um valor v�lido.");
		} else if (valor > this.getSaldo2()) {
			System.out.println("Valor indispon�vel.");
		} else if (this.getSaldo2() == 0) {
			System.out.println("Valor indispon�vel");
		} else {
			this.setSaldo2(getSaldo2()-valor);
			System.out.println("D�bito no valor R$ "+valor+" feito com sucesso.");
		}
	}
	
	@Override
	public void repeteOp(){
		System.out.println(" ");
		System.out.println("SALDO: R$"+this.getSaldo2());
		System.out.println("-----------------------");
		System.out.println("Deseja repetir a opera��o? S/N:");
	}
	
	@Override
	public void mostraMenu(){
		System.out.println("-------- BANK NINE9 ------");
		System.out.println("---ATRIBUINDO EXPOENTE----");
		System.out.println("-----AO SEU PATRIM�NIO----");
		System.out.println("-----------MENU-----------");
		System.out.println("1 - Conta Poupan�a");
		System.out.println("2 - Conta Corrente");
		System.out.println("3 - Conta Especial");
		System.out.println("4 - Conta Empresa");
		System.out.println("5 - Conta Estudantil");
		System.out.println("6 - Sair");
		System.out.println("---------------------------");
		System.out.println("Digite a op��o desejada: ");
	}
	
	public void mostraCheque() {
		this.setCheque(this.getCheque()-1);
		this.setSaldo2(this.getSaldo2()-30.00);
		System.out.println("Seu tal�o foi solicitado com sucesso");
		System.out.println("Total de cheques dispon�veis: "+this.getCheque());
		//break;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
