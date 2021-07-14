package Entities;

public class EmprestimoEmpresa extends ContaGeral {
	protected double saldo4;
	private double emprestimoEmpresa = 10000;
	
	public EmprestimoEmpresa(String tipo, int numero) {
		super(tipo, numero);
	}
	public double getSaldo4() {
		return saldo4;
	}
	public void setSaldo4(double saldo4) {
		this.saldo4 = saldo4;
	}
	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}
	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	@Override
	public void mostraHeader() {
		System.out.println(" ");
		System.out.println("Conta: "+this.getNumero()+" - BANK NINE9");
		System.out.println(this.getTipo());
		System.out.println("-----------------------");
		System.out.println("SALDO: R$ "+this.getSaldo4());
		System.out.println("EMPRÉSTIMO DISPONÍVEL: R$"+this.getEmprestimoEmpresa());
	}
	
	
	@Override
	public void creditar(double valor) {
		if (valor <= 0) {
			System.out.println("Insira um valor válido.");
		} else {
			this.setSaldo4(getSaldo4()+valor);
			System.out.println("Crédito no valor R$ "+valor+" feito com sucesso.");
		}
	}
	
	@Override
	public void debitar(double valor) {
		if (valor <= 0) {
			System.out.println("Insira um valor válido.");
		} else if (valor > this.getSaldo4()) {
			System.out.println("Valor indisponível.");
		} else if (this.getSaldo4() == 0) {
			System.out.println("Valor indisponível");
		} else {
			this.setSaldo4(getSaldo4()-valor);
			System.out.println("Débito no valor R$ "+valor+" feito com sucesso.");
		}
	}
	
	@Override
	public void repeteOp(){
		System.out.println(" ");
		System.out.println("SALDO: R$"+this.getSaldo4());
		System.out.println("EMPRÉSTIMO DISPONÍVEL: R$"+this.getEmprestimoEmpresa());
		System.out.println("-----------------------");
		System.out.println("Deseja repetir a operação? S/N:");
	}
	
	
	public void emprestimo(double valor) {
		if (valor <= 0 ) {
			System.out.println("Valor inválido.");
		}	else if (valor <= this.getEmprestimoEmpresa()) {
			this.setEmprestimoEmpresa(this.getEmprestimoEmpresa()-valor);
			this.setSaldo4(this.getSaldo4()+valor);
		} else {
			System.out.println("Valor indisponível.");
		}
	}
	
	
}
