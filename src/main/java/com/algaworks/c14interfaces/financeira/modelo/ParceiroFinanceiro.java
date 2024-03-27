package com.algaworks.c14interfaces.financeira.modelo;

public class ParceiroFinanceiro extends Empresa {
	private double valorTotalFinanciado;

	public ParceiroFinanceiro(String razaoSocial, double totalFaturamento) {
		super(razaoSocial, totalFaturamento);
	}

	public double getValorTotalFinanciado() {
		return valorTotalFinanciado;
	}

	public void adicionarNovaAplicacao(double valorFinanciado) {
		valorTotalFinanciado += valorFinanciado;
	}

}
