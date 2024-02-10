package modelo;

public class CarroParticular extends VeiculoAutomotor {
	public CarroParticular(String modelo, int anoFabricacao, double valorMercado) {
		super(modelo, anoFabricacao, valorMercado);
	}

	@Override
	public double calcularValorPremio() {
		double valorPremio = getValorMercado() * 0.04;

		if (getAnoFabricacao() < 2000) {
			valorPremio *= 1.05; ;
		}

		return valorPremio;
	}

	@Override
	public void descrever() {
		System.out.printf("Carro particular %s ano %d, avaliado em R$%.2f%n", getModelo(), getAnoFabricacao(), getValorMercado());
	}
}
