package com.algaworks.c14interfaces.financeira.service;

import com.algaworks.c14interfaces.financeira.modelo.ClienteFinanciavel;

public class ServicoFinanciamento {

	public void solicitarFinanciamento(ClienteFinanciavel cliente, double valorSolicitado) {
		var limiteAprovado = cliente.calcularLimiteAprovado();
		var jurosCalculado = cliente.calcularJuros(valorSolicitado);

		if (limiteAprovado < valorSolicitado) {
			throw new RuntimeException(String.format(
				"Financiamento não aprovado. Limite máximo de %.2f", limiteAprovado
			));
		}

		System.out.printf("DEBUG: Financiamento aprovado no valor de R$%.2f com juros de %.2f%%. Limite máximo de R$%.2f%n",
				valorSolicitado, jurosCalculado, limiteAprovado);
	}

	public double consultarLimiteAprovado(ClienteFinanciavel cliente) {
		return cliente.calcularLimiteAprovado();
	}
}
