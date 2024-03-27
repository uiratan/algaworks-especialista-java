package com.algaworks.c13polimorfismo.desafio1311impostos;

public abstract class Pessoa {
	private String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public abstract double calcularImpostos();
}
