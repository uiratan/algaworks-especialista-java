package com.algaworks.c16excecoes.desafio.banco;

public class SaldoInsuficienteException extends OperacaoBancariaException {

	public SaldoInsuficienteException(String message) {
		super(message);
	}

	public SaldoInsuficienteException(String message, Throwable cause) {
		super(message, cause);
	}

}