package modelo;

public class Caminhao extends VeiculoAutomotor {
	private int quantidadeEixos;

	public Caminhao(String modelo, int anoFabricacao, double valorMercado, int quantidadeEixtos) {
		super(modelo, anoFabricacao, valorMercado);
		this.quantidadeEixos = quantidadeEixtos;
	}

	public int getQuantidadeEixos() {
		return quantidadeEixos;
	}

	public void setQuantidadeEixos(int quantidadeEixos) {
		this.quantidadeEixos = quantidadeEixos;
	}

	@Override
	public double calcularValorPremio() {
		return (getValorMercado() * 0.02) + (50 * getQuantidadeEixos());
	}

	@Override
	public void descrever() {
		System.out.printf("Caminhão %s ano %d, %d eixos, avaliado em R$%.2f%n", getModelo(), getAnoFabricacao(), getQuantidadeEixos(), getValorMercado());
	}
}
