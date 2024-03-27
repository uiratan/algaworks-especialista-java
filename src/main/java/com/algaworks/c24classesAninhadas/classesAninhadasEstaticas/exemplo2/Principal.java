package com.algaworks.c24classesAninhadas.classes;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente("João", 30));
		clientes.add(new Cliente("Maria", 90));
		clientes.add(new Cliente("Sebastião", 50));
		clientes.add(new Cliente("Joaquina", 45));
		clientes.add(new Cliente("Josefina", 25));

		Cliente.ordenarPorIdade(clientes);

		System.out.println(clientes);

		var cliente = new Cliente("João", 30);
		cliente.setStatus(Cliente.Status.BLOQUEADO);
	}
}
