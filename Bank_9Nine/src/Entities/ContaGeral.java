package Entities;

public abstract class ContaGeral {
	protected double saldo;
	private double credito;
	private double debito;
	private int escolhaCredDeb;
	private String respostaRepeteSN;
	private String tipo;
	private int numero;
		
	public ContaGeral(double saldo, double credito, double debito, int escolhaCredDeb,
			String respostaRepeteSN, String tipo, int numero) {
		super();
		this.saldo = saldo;
		this.credito = credito;
		this.debito = debito;
		this.escolhaCredDeb = escolhaCredDeb;
		this.respostaRepeteSN = respostaRepeteSN;
		this.tipo = tipo;
		this.numero = numero;
	}
	
	public ContaGeral(String tipo, int numero) {
		super();
		this.tipo = tipo;
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getCredito() {
		return credito;
	}
	
	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	public double getDebito() {
		return debito;
	}
	
	public void setDebito(double debito) {
		this.debito = debito;
	}
	
	public int getEscolhaCredDeb() {
		return escolhaCredDeb;
	}
	
	public void setEscolhaCredDeb(int escolhaCredDeb) {
		this.escolhaCredDeb = escolhaCredDeb;
	}

	public String getRespostaRepeteSN() {
		return respostaRepeteSN;
	}
	
	public void setRespostaRepeteSN(String respostaRepeteSN) {
		this.respostaRepeteSN = respostaRepeteSN;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void mostraHeader() {
		System.out.println(" ");
		System.out.println("Conta: "+this.getNumero()+" - BANK NINE9");
		System.out.println(this.getTipo());
		System.out.println("-----------------------");
		System.out.println("SALDO: R$ "+this.getSaldo());
	}
	
	public void mostraCredDeb(){
		System.out.println(" ");
		System.out.println("-----------------------");
		System.out.println("1 - Cr�dito");
		System.out.println("2 - D�bito");
		System.out.println("-----------------------");
		System.out.println("Digite a op��o desejada: ");
		
	}
	
	public void creditar(double valor) {
		if (valor <= 0) {
			System.out.println("Insira um valor v�lido.");
		} else {
			this.setSaldo(getSaldo()+valor);
			System.out.println("Cr�dito no valor R$ "+valor+" feito com sucesso.");
		}
	}
	
	public void debitar(double valor) {
		if (valor <= 0) {
			System.out.println("Insira um valor v�lido.");
		} else if (valor > this.getSaldo()) {
			System.out.println("Valor indispon�vel.");
		} else if (this.getSaldo() == 0) {
			System.out.println("Valor indispon�vel");
		} else {
			this.setSaldo(getSaldo()-valor);
			System.out.println("D�bito no valor R$ "+valor+" feito com sucesso.");
		}
	}
	
		
	public void repeteOp(){
		System.out.println(" ");
		System.out.println("SALDO: R$"+this.getSaldo());
		System.out.println("-----------------------");
		System.out.println("Deseja repetir a opera��o? S/N:");
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
