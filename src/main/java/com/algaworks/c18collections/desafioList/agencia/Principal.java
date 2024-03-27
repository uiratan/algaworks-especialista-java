package com.algaworks.c18collections.desafioList.agencia;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		CadastroPacoteViagem cadastro = new CadastroPacoteViagem();
		cadastro.adicionar("Ubajara (17 noites)", 10_000);
		cadastro.adicionar("Istambul e Capadócia (20 noites)", 18_000);
		cadastro.adicionar("Neve em Bariloche (10 noites)", 11_000);
		cadastro.adicionar("Disney (10 noites)", 20_000);
		cadastro.adicionar("Natal Luz em Gramado (5 noites)", 8_500);

		cadastro.adicionar("Disney (7 noites)", 20_000);
        cadastro.removerPorDescricao("Disney (7 noites)");

        cadastro.ordenar();

        cadastro.ordenarPorPrecoDecrescente();

        PacoteViagem pacoteEncontrado = cadastro.buscarPorDescricao("Disney (10 noites)");
        System.out.println(pacoteEncontrado);

		System.out.println("------------------------------");
		imprimirPacotes(cadastro.obterTodos());
	}

	private static void imprimirPacotes(List<PacoteViagem> pacotes) {
		for (PacoteViagem pacote : pacotes) {
			System.out.printf("%s -> %.2f%n", pacote.getDescricao(), pacote.getPrecoPorPessoa());
		}
	}

}