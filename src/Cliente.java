class Cliente {
	private String nome;
	Cliente() {

	}

	Cliente(String nome) {
		setNome(nome);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void mudaCPF(String cpf) {
		validaCPF(cpf);
	}

	private void validaCPF(String cpf) {
		if (cpf == "0000000000-0") {
			System.out.println("CPF INVALIDO!");
		}
	}
}
