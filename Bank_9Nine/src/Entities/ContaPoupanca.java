package Entities;

public class ContaPoupanca extends ContaGeral {
	private int diaNiver;
	private int respostaDia;
	protected double saldo1;
	
	public ContaPoupanca(String tipo, int numero, int diaNiver) {
		super(tipo, numero);
		this.diaNiver = diaNiver;
	}

	public int getDiaNiver() {
		return diaNiver;
	}

	public void setDiaNiver(int diaNiver) {
		this.diaNiver = diaNiver;
	}

	public int getRespostaDia() {
		return respostaDia;
	}

	public void setRespostaDia(int respostaDia) {
		this.respostaDia = respostaDia;
	}
	
	
	public double getSaldo1() {
		return saldo1;
	}

	public void setSaldo1(double saldo1) {
		this.saldo1 = saldo1;
	}
	
	@Override
	public void mostraHeader() {
		System.out.println(" ");
		System.out.println("Conta: "+this.getNumero()+" - BANK NINE9");
		System.out.println(this.getTipo());
		System.out.println("-----------------------");
		System.out.println("SALDO: R$ "+this.getSaldo1());
	}

	@Override
	public void creditar(double valor) {
		if (valor <= 0) {
			System.out.println("Insira um valor v�lido.");
		} else {
			this.setSaldo1(getSaldo1()+valor);
			System.out.println("Cr�dito no valor R$ "+valor+" feito com sucesso.");
		}
	}
	
	@Override
	public void debitar(double valor) {
		if (valor <= 0) {
			System.out.println("Insira um valor v�lido.");
		} else if (valor > this.getSaldo1()) {
			System.out.println("Valor indispon�vel.");
		} else if (this.getSaldo1() == 0) {
			System.out.println("Valor indispon�vel");
		} else {
			this.setSaldo1(getSaldo1()-valor);
			System.out.println("D�bito no valor R$ "+valor+" feito com sucesso.");
		}
	}
	
	@Override
	public void repeteOp(){
		System.out.println(" ");
		System.out.println("SALDO: R$"+this.getSaldo1());
		System.out.println("-----------------------");
		System.out.println("Deseja repetir a opera��o? S/N:");
	}
	
	public void perguntarDia() {
		System.out.println("Informe a data de hoje (DD): ");
	}
	
	
	public void ajustarPoupanca() {
		if (this.getDiaNiver() == this.getRespostaDia()) {
			this.setSaldo1(this.getSaldo1()+((this.getSaldo1()*0.05)/100));
			System.out.println("Reajuste de saldo + 0.05%");
		}
	}
	
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
	
	
}
