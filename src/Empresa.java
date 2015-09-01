class Empresa {
	private Funcionario[] funcionario = new Funcionario[10];

	public void adiciona(Funcionario f) {
		for (int i = 0; i < funcionario.length; i++) {
			if (funcionario[i] == null) {
				this.funcionario[i] = f;
				break;
			}
		}

	}

	public void mostraFuncionario() {
		for (int i = 0; i < this.funcionario.length; i++) {
			System.out.println("Funcionario na posicao: " + i);
		}
	}
}
