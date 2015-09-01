public class Principal {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.depositar(400);
		System.out.println(conta.getSaldo());
	}
}
