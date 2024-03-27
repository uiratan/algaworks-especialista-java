package com.algaworks.c13polimorfismo.desafio1311impostos;

public class GestorDeImpostos {
	private double valorTotalImpostos;

	public void adicionar(Pessoa pessoa) {
		valorTotalImpostos += pessoa.calcularImpostos();
		System.out.printf("Impostos devidos de %s: %.2f%n", pessoa.getNome(), pessoa.calcularImpostos());
	}

	public double getValorTotalImpostos() {
		return valorTotalImpostos;
	}
}
