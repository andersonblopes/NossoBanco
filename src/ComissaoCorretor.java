public class ComissaoCorretor {
	private double totalDeComissao;

	public void registraComissao(Imovel imovel) {
		totalDeComissao += 1;//imovel.getAluguel() * 5 / 100;
	}

	public double getTotalDeComissao() {
		return this.totalDeComissao;
	}
}
