package com.algaworks.financeira.service;

import com.algaworks.financeira.modelo.PessoaBonificavel;

public class ServicoPagamentoBonus {

	public void pagar(PessoaBonificavel pessoa, double percentualMetaAlcancada) {
		var valorBonus = pessoa.calcularBonus(percentualMetaAlcancada);

		System.out.printf("DEBUG: Bônus pago no valor de R$%.2f", valorBonus);
	}
}
