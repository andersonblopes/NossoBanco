class GerenciamentoDeConta {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.setNome("Anderson");
		c1.setNumero(25);
		c1.setSaldo(1000);
		c1.setLimite(2000);
		Conta c2 = new Conta();
		c2.setNome("Lopes");
		c2.setNumero(50);
		c2.setSaldo(3000);
		c2.setLimite(4000);
		c1.transferepara(c2, 500);
		System.out.println("=================" + "\n" + "Conta1" + "\n"
				+ "===============");
		System.out.println("Dono: " + c1.getNome() + "\n" + "Numero: " + c1.getNumero()
				+ "\n" + "Saldo: " + c1.getSaldo() + "\n" + "Limite: " + c1.getLimite());
		System.out.println("=================" + "\n" + "Conta2" + "\n"
				+ "===============");
		System.out.println("Dono: " + c2.getNome() + "\n" + "Numero: " + c2.getNumero()
				+ "\n" + "Saldo: " + c2.getSaldo() + "\n" + "Limite:" + c2.getLimite());
	}
}
