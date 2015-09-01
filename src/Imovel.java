public class Imovel {
	private String localizacao;
	private double valor;

	public double getAluguel() {
		return this.valor * 40 / 100;
	}

	public double getIptu() {
		return this.valor * 10 / 100;
	}

	public String getLocalizacao() {
		return this.localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
