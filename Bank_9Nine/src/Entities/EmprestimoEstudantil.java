package Entities;

public class EmprestimoEstudantil extends ContaGeral {
	protected double saldo5;
	private double emprestimoEstudante = 5000;
	public EmprestimoEstudantil(String tipo, int numero) {
		super(tipo, numero);
	}
	
	
	public double getSaldo5() {
		return saldo5;
	}


	public void setSaldo5(double saldo5) {
		this.saldo5 = saldo5;
	}


	public double getEmprestimoEstudante() {
		return emprestimoEstudante;
	}


	public void setEmprestimoEstudante(double emprestimoEstudante) {
		this.emprestimoEstudante = emprestimoEstudante;
	}




	@Override
	public void mostraHeader() {
		System.out.println(" ");
		System.out.println("Conta: "+this.getNumero()+" - BANK NINE9");
		System.out.println(this.getTipo());
		System.out.println("-----------------------");
		System.out.println("SALDO: R$ "+this.getSaldo5());
		System.out.println("EMPR�STIMO DISPON�VEL: R$"+this.getEmprestimoEstudante());
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
			this.setSaldo5(getSaldo5()+valor);
			System.out.println("Cr�dito no valor R$ "+valor+" feito com sucesso.");
		}
	}
	
	@Override
	public void debitar(double valor) {
		if (valor <= 0) {
			System.out.println("Insira um valor v�lido.");
		} else if (valor > this.getSaldo5()) {
			System.out.println("Valor indispon�vel.");
		} else if (this.getSaldo5() == 0) {
			System.out.println("Valor indispon�vel");
		} else {
			this.setSaldo5(getSaldo5()-valor);
			System.out.println("D�bito no valor R$ "+valor+" feito com sucesso.");
		}
	}
	
	@Override
	public void repeteOp(){
		System.out.println(" ");
		System.out.println("SALDO: R$"+this.getSaldo5());
		System.out.println("EMPR�STIMO DISPON�VEL: R$"+this.getEmprestimoEstudante());
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
	
	public void emprestimo(double valor) {
		if (valor <= 0 ) {
			System.out.println("Valor inv�lido.");
		}	else if (valor <= this.getEmprestimoEstudante()) {
			this.setEmprestimoEstudante(this.getEmprestimoEstudante()-valor);
			this.setSaldo5(this.getSaldo5()+valor);
		} else {
			System.out.println("Valor indispon�vel.");
		}
	}
}
