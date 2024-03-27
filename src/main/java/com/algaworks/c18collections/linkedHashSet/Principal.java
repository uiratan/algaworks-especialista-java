package com.algaworks.c18collections.linkedHashSet;


import com.algaworks.c18collections.hashSet.crm.Contato;

import java.util.LinkedHashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		Set<Contato> contatos = new LinkedHashSet<>();

		System.out.println("---");
		contatos.add(new Contato("Maria", "maria@algaworks.com", 40));
		contatos.add(new Contato("Ana", "ana@algaworks.com", 30));
		contatos.add(new Contato("José", "jose@algaworks.com", 25));
		contatos.add(new Contato("Rosa", "rosa@algaworks.com", 50));
		contatos.add(new Contato("João", "joao@algaworks.com", 70));
		System.out.println("---");

//        contatos.add(new Contato("Maria", "maria@algaworks.com", 20));
//        contatos.add(new Contato("Manoel", "manoel@algaworks.com", 40));

        contatos.add(null);
//        contatos.add(new Contato("Ana Silva", "ana@algaworks.com", 10));

		for (Contato contato : contatos) {
			System.out.println(contato);
		}
	}

}