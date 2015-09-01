public class TesteAluguelImoveis {
	public static void main(String[] args) {
		Imovel imovel = new Imovel();
		Casa casa = new Casa();
		Apartamento apartamento = new Apartamento();
		Duplex duplex = new Duplex(90.0);

		imovel.setValor(25000);
		casa.setValor(25000);
		apartamento.setValor(25000);

		System.out.println("Aluguel padrão: " + imovel.getIptu());
		System.out.println("IPTU Padrão: " + imovel.getAluguel());

		System.out.println("Aluguel Casa: " + casa.getIptu());
		System.out.println("IPTU Casa: " + casa.getAluguel());

		System.out.println("Aluguel AP: " + apartamento.getAluguel());
		System.out.println("IPTU AP: " + apartamento.getIptu());

		System.out.println("Aluguel Duplex: " + duplex.getAluguel());
		System.out.println("IPTU Duplex" + duplex.getIptu());

		ComissaoCorretor comissao = new ComissaoCorretor();

		comissao.registraComissao(casa);
		comissao.registraComissao(apartamento);
		comissao.registraComissao(duplex);

		System.out.println("Total de comissão: "
				+ comissao.getTotalDeComissao());
	}
}
