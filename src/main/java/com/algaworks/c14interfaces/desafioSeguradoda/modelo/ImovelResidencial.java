package com.algaworks.c14interfaces.desafioSeguradoda.modelo;

public class ImovelResidencial implements BemSeguravel {
	private double valorMercado;
	private int areaConstruida;

	public ImovelResidencial(double valorMercado, int areaConstruida) {
		this.valorMercado = valorMercado;
		this.areaConstruida = areaConstruida;
	}

	public double getValorMercado() {
		return valorMercado;
	}

	public void setValorMercado(double valorMercado) {
		this.valorMercado = valorMercado;
	}

	public int getAreaConstruida() {
		return areaConstruida;
	}

	public void setAreaConstruida(int areaConstruida) {
		this.areaConstruida = areaConstruida;
	}

	@Override
	public double calcularValorPremio() {
		// valor de mercado * 1%
		// + 0,30 por m area construida
		return (getValorMercado() * 0.001) + (getAreaConstruida() * 0.3);
	}

	@Override
	public String descrever() {
		return String.format("Imóvel residencial com %dm2 de área construída, avaliado em R$%.2f",
				getAreaConstruida(), getValorMercado());

	}

}
