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
		System.out.println("EMPRÉSTIMO DISPONÍVEL: R$"+this.getEmprestimoEstudante());
	}
	

	
	@Override
	public void creditar(double valor) {
		if (valor <= 0) {
			System.out.println("Insira um valor válido.");
		} else {
			this.setSaldo5(getSaldo5()+valor);
			System.out.println("Crédito no valor R$ "+valor+" feito com sucesso.");
		}
	}
	
	@Override
	public void debitar(double valor) {
		if (valor <= 0) {
			System.out.println("Insira um valor válido.");
		} else if (valor > this.getSaldo5()) {
			System.out.println("Valor indisponível.");
		} else if (this.getSaldo5() == 0) {
			System.out.println("Valor indisponível");
		} else {
			this.setSaldo5(getSaldo5()-valor);
			System.out.println("Débito no valor R$ "+valor+" feito com sucesso.");
		}
	}
	
	@Override
	public void repeteOp(){
		System.out.println(" ");
		System.out.println("SALDO: R$"+this.getSaldo5());
		System.out.println("EMPRÉSTIMO DISPONÍVEL: R$"+this.getEmprestimoEstudante());
		System.out.println("-----------------------");
		System.out.println("Deseja repetir a operação? S/N:");
	}
	

	
	public void emprestimo(double valor) {
		if (valor <= 0 ) {
			System.out.println("Valor inválido.");
		}	else if (valor <= this.getEmprestimoEstudante()) {
			this.setEmprestimoEstudante(this.getEmprestimoEstudante()-valor);
			this.setSaldo5(this.getSaldo5()+valor);
		} else {
			System.out.println("Valor indisponível.");
		}
	}
}
