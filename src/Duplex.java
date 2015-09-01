public class Duplex extends Imovel {

	Duplex(double valor) {
		setValor(valor);
	}

	public double getAluguel() {
		return super.getAluguel() + 900;
	}

	public double getIptu() {
		return super.getIptu() + 800;
	}

}
