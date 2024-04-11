package com.algaworks.c25interfacesFuncionais.desafio2517;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
// import java.util.function.Consumer;
// import java.util.function.Function;
// import java.util.function.Predicate;

public class Principal {

    public static void main(String[] args) {
		var funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(new Funcionario("João", new BigDecimal("19000"), true));
		funcionarios.add(new Funcionario("Maria", new BigDecimal("5000"), true));
		funcionarios.add(new Funcionario("Manoel", new BigDecimal("13000"), true));
		funcionarios.add(new Funcionario("Sebastião", new BigDecimal("12000"), false));
                
		// TODO remover funcionários inativos
        // Predicate<Funcionario> predicateInativo = funcionario -> funcionario.isInativo();
        // Predicate<Funcionario> predicateInativo = Funcionario::isInativo;
        // funcionarios.removeIf(predicateInativo);
        funcionarios.removeIf(Funcionario::isInativo);

		// TODO ordenar funcionários pelo valor do salário
        // Function<Funcionario, BigDecimal> functionOrdemSalario = funcionario -> funcionario.getSalario();
        // Function<Funcionario, BigDecimal> functionOrdemSalario = Funcionario::getSalario;
        // funcionarios.sort(Comparator.comparing(functionOrdemSalario));
        funcionarios.sort(Comparator.comparing(Funcionario::getSalario));

		// TODO iterar e imprimir funcionários usando o método estático imprimir
        // Consumer<Funcionario> consumerImprimir = funcionario -> imprimir(funcionario);
        // Consumer<Funcionario> consumerImprimir = Principal::imprimir;
        // funcionarios.forEach(consumerImprimir);
        funcionarios.forEach(Principal::imprimir);
	}

	private static void imprimir(Funcionario funcionario) {       
        System.out.printf("Nome: %s - Salário: %s - Impostos: %s%n",
				funcionario.getNome(), funcionario.getSalario(),
				funcionario.getSalario().multiply(new BigDecimal("0.20")));

	}

}