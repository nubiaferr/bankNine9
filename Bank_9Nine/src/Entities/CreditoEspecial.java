package Entities;

public class CreditoEspecial extends ContaGeral {
	protected double saldo3;
	private double lis = 1000;
	private double diferenca;
	
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
	public void mostraCredDeb(){
		System.out.println(" ");
		System.out.println("-----------------------");
		System.out.println("1 - Crédito");
		System.out.println("2 - Débito");
		System.out.println("-----------------------");
		System.out.println("Digite a opção desejada: ");
	}
	
	@Override
	public void creditar(double valor) {
		if (valor <= 0) {
			System.out.println("Insira um valor válido.");
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
	
	@Override
	public void mostraMenu(){
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
	}
	
	
	
	
	

}
