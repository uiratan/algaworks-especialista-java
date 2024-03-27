package com.algaworks.c14interfaces.desafioSeguradoda.service;

import com.algaworks.c14interfaces.desafioSeguradoda.modelo.BemSeguravel;

public class ServicoPropostaSeguro {

	public void emitir(BemSeguravel bemSeguravel) {
		System.out.println("---------------------");
		System.out.println("Proposta de seguro");
		System.out.println("---------------------");
		System.out.println(bemSeguravel.descrever());
		System.out.printf("Prêmio: R$%.2f%n", bemSeguravel.calcularValorPremio());
	}
}
