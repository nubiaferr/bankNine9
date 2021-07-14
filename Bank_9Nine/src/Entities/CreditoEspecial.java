package Entities;

public class CreditoEspecial extends ContaGeral {
	protected double saldo3;
	private double lis = 1000;
	private double diferenca;
	private double diferenca2;
	
	public CreditoEspecial(String tipo, int numero) {
		super(tipo, numero);
	}

	public double getSaldo3() {
		return saldo3;
	}

	public void setSaldo3(double saldo3) {
		this.saldo3 = saldo3;
	}

	public double getLis() {
		return lis;
	}

	public void setLis(double lis) {
		this.lis = lis;
	}

	public double getDiferenca() {
		return diferenca;
	}

	public void setDiferenca(double diferenca) {
		this.diferenca = diferenca;
	}
		
	public double getDiferenca2() {
		return diferenca2;
	}

	public void setDiferenca2(double diferenca2) {
		this.diferenca2 = diferenca2;
	}

	@Override
	public void mostraHeader() {
		System.out.println(" ");
		System.out.println("Conta: "+this.getNumero()+" - BANK NINE9");
		System.out.println(this.getTipo());
		System.out.println("-----------------------");
		System.out.println("SALDO: R$ "+this.getSaldo3());
		System.out.println("CRÉDITO ESPECIAL: "+this.getLis());
	}
	

	
	@Override
	public void creditar(double valor) {
		if (valor <= 0) {
			System.out.println("Insira um valor válido.");
		} else if (this.getLis() < 1000.00) {
			this.setDiferenca(1000-this.getLis());
			if (valor == this.getDiferenca()) {
				this.setLis(this.getLis()+valor);
			} else if (valor < this.getDiferenca()) {
				this.setLis(this.getLis()+valor);
				this.setDiferenca(this.getDiferenca()-valor);
			} else if (valor > this.getDiferenca()) {
				this.setLis(this.getLis()+this.getDiferenca());
				this.setDiferenca2(valor-this.getDiferenca());
				this.setSaldo3(this.getDiferenca2());				
			}
		} else {
			this.setSaldo3(getSaldo3()+valor);
			System.out.println("Crédito no valor R$ "+valor+" feito com sucesso.");
		}
	}
	
	@Override
	public void debitar(double valor) {
		
		if (valor <= 0) {
			System.out.println("Insira um valor válido.");
		} else if (valor <= this.getSaldo3()) {
			this.setSaldo3(getSaldo3()-valor);
			System.out.println("Débito no valor R$ "+valor+" feito com sucesso.");
		} else if (valor>this.getSaldo3() && valor>this.getLis() && valor>this.getSaldo3()+this.getLis()) {
			System.out.println("Valor indisponível");
		} else if (valor > this.getSaldo3()) {
			this.setDiferenca(valor-this.getSaldo3());
			this.setLis(this.getLis()-this.getDiferenca());
			this.setSaldo3(this.getSaldo3()+this.getDiferenca());
			this.setSaldo3(this.getSaldo3()-valor);
			System.out.println("Valor debitado: R$"+ this.getDiferenca());
		} else {
			System.out.println("Erro");
		}
	}
	
	@Override
	public void repeteOp(){
		System.out.println(" ");
		System.out.println("SALDO: R$"+this.getSaldo3());
		System.out.println("CRÉDITO ESPECIAL DISPONÍVEL: R$"+this.getLis());
		System.out.println("-----------------------");
		System.out.println("Deseja repetir a operação? S/N:");
	}
	
	
	
	
	
	

}
