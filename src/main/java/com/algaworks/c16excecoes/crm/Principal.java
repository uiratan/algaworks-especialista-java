package com.algaworks.c16excecoes.crm;

public class Principal {

	public static void main(String[] args) {
		var servicoCadastroCliente = new ServicoCadastroCliente();
		var cliente = servicoCadastroCliente.cadastrar("Joao", 15);

		System.out.printf("Cliente cadastrado: %s%n", cliente.getNome());
	}
}
