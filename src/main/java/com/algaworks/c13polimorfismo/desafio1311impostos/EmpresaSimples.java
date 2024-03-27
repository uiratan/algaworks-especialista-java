package com.algaworks.c13polimorfismo.desafio1311impostos;

public class EmpresaSimples extends PessoaJuridica {
	public static final double ALIQUOTA_IMPOSTO_FATURAMENTO = 0.06;

	public EmpresaSimples(String nome, double faturamentoAnual, double despesaAnual) {
		super(nome, faturamentoAnual, despesaAnual);
	}

	@Override
	public double calcularImpostos() {
		return getFaturamentoAnual() * ALIQUOTA_IMPOSTO_FATURAMENTO;
	}
}
