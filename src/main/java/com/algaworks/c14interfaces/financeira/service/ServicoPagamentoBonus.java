package com.algaworks.c14interfaces.financeira.service;

import com.algaworks.c14interfaces.financeira.modelo.PessoaBonificavel;

public class ServicoPagamentoBonus {

	public void pagar(PessoaBonificavel pessoa, double percentualMetaAlcancada) {
		var valorBonus = pessoa.calcularBonus(percentualMetaAlcancada);

		System.out.printf("DEBUG: Bônus pago no valor de R$%.2f", valorBonus);
	}
}
