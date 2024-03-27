package com.algaworks.c16excecoes.crm;

public class ServicoCadastroCliente {

	public Cliente cadastrar(String nome, int idade) {
		if (idade < 18) {
			throw new MenorIdadeException("Cliente menor de idade não pode ser cadastrado");
		}

		return new Cliente(nome, idade);
	}

}
