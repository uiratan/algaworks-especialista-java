package com.algaworks.estoque;

import java.util.Objects;

public class Produto {

	private String nome;
	private int quantidadeEstoque;
	private boolean ativo;

	public Produto(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
//		if (nome == null) {
//			throw new NullPointerException("Nome deve ser infromado");
//		}
//		equivalente à seguinte execução da classe utilitaria

		Objects.requireNonNull(nome, "Nome deve ser infromado");
		this.nome = nome;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public boolean isAtivo() {
		return ativo;
	}

	public boolean isInativo() {
		return !ativo;
	}

	public void ativar() {
		this.ativo = true;
	}

	public void desativar() {
		this.ativo = false;
	}

	public void retirarEstoque(int quantidade) {
		if (quantidade <= 0) {
			throw new IllegalArgumentException("Quantidade não pode ser zero ou negativa para retirada no estoque.");
		}

		if (isInativo()) {
			throw new IllegalStateException("Retirada no estoque não pode ser realizada em produto inativo.");
		}

		if (quantidade > getQuantidadeEstoque()) {
			throw new IllegalArgumentException("Quantidade no estoque é insuficiente para esta retirada.");
		}

		this.quantidadeEstoque -= quantidade;
	}

	public void adicionarEstoque(int quantidade) {
		this.quantidadeEstoque += quantidade;
	}

}
