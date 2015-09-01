abstract class Conta {
	private static int totalContas = 0;
	private int numero;
	private int valor;
	private double saldo, limite;
	Cliente cliente;
	private String nome;

	Conta() {
	}

	Conta(String nome, int numero) {
		setNumero(numero);
		Conta.setTotalContas(Conta.getTotalContas() + 1);
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void transferepara(Conta destino, int valor) {
		this.sacar(valor);
		destino.depositar(valor);
	}

	public void sacar(int valor) {
		setSaldo(getSaldo() - valor);
	}

	public void depositar(int valor) {
		setSaldo(getSaldo() + valor);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public static int getTotalContas() {
		return totalContas;
	}

	public static void setTotalContas(int totalContas) {
		Conta.totalContas = totalContas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	abstract void atualiza();
}
