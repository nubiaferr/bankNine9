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
	public void creditar(double valor) {
		if (valor <= 0) {
			System.out.println("Insira um valor válido.");
		} else {
			this.setSaldo2(getSaldo2()+valor);
			System.out.println("Crédito no valor R$ "+valor+" feito com sucesso.");
		}
	}
	
	@Override
	public void debitar(double valor) {
		if (valor <= 0) {
			System.out.println("Insira um valor válido.");
		} else if (valor > this.getSaldo2()) {
			System.out.println("Valor indisponível.");
		} else if (this.getSaldo2() == 0) {
			System.out.println("Valor indisponível");
		} else {
			this.setSaldo2(getSaldo2()-valor);
			System.out.println("Débito no valor R$ "+valor+" feito com sucesso.");
		}
	}
	
	@Override
	public void repeteOp(){
		System.out.println(" ");
		System.out.println("SALDO: R$"+this.getSaldo2());
		System.out.println("-----------------------");
		System.out.println("Deseja repetir a operação? S/N:");
	}
	
	
	
	public void mostraCheque() {
		this.setCheque(this.getCheque()-1);
		this.setSaldo2(this.getSaldo2()-30.00);
		System.out.println("Seu talão foi solicitado com sucesso");
		System.out.println("Total de cheques disponíveis: "+this.getCheque());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
