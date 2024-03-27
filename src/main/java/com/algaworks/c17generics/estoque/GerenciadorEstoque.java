package com.algaworks.c17generics.estoque;

public class GerenciadorEstoque<T extends Estocavel> {

	private int quantidadeTotal;

	public void adicionar(T estocavel) {
		quantidadeTotal += estocavel.getQuantidadeEstoque();
	}

	public int getQuantidadeTotal() {
		return quantidadeTotal;
	}

}