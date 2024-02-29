package com.algaworks.estoque;

public class ProdutoSemEstoqueSuficienteException extends RuntimeException {
	public ProdutoSemEstoqueSuficienteException(String message) {
		super(message);
	}
}
