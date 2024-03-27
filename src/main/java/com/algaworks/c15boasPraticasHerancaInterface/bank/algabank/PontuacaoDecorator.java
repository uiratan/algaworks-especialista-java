package com.algaworks.c15boasPraticasHerancaInterface.bank.algabank;

import com.algaworks.c15boasPraticasHerancaInterface.bank.javabank.Conta;

public class PontuacaoDecorator extends ContaBaseDecorator {

	private int pontos;

	public PontuacaoDecorator(Conta contaOriginal) {
		super(contaOriginal);
	}

	public int getPontos() {
		return pontos;
	}

	@Override
	public void depositar(double valor) {
		getContaOriginal().depositar(valor);
		pontos += valor / 100;
	}

}
