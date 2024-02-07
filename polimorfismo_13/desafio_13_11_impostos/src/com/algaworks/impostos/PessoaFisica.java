package com.algaworks.impostos;

public class PessoaFisica extends Pessoa {
	public static final double RECEITA_ANUAL_ISENCAO = 50_000;
	public static final double ALIQUOTA_IMPOSTO_RENDA = 0.20;

	public double receitaAnual;

	public PessoaFisica(String nome, double receitaAnual) {
		super(nome);
		this.receitaAnual = receitaAnual;
	}

	public double getReceitaAnual() {
		return receitaAnual;
	}

	@Override
	public double calcularImpostos() {
		if (getReceitaAnual() < RECEITA_ANUAL_ISENCAO) {
			return 0;
		}

		return getReceitaAnual() * ALIQUOTA_IMPOSTO_RENDA;
	}
}
