package com.algaworks.c18collections.linkedHashSetAndTreeMap;


import com.algaworks.c18collections.linkedHashSetAndTreeMap.detran.Carro;
import com.algaworks.c18collections.linkedHashSetAndTreeMap.detran.Proprietario;

import java.util.Map;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		Proprietario maria = new Proprietario("Maria", "05577788899");
		Proprietario ana = new Proprietario("Ana", "33344488811");
		Proprietario jose = new Proprietario("José", "09988877766");
		Proprietario joao = new Proprietario("João", "22233344455");

		Carro bmw = new Carro("ALG1A23", "BMW X3");
		Carro honda = new Carro("WOR9K87", "Honda HR-V");
		Carro ford = new Carro("JAV5A67", "Ford Ka");
		Carro porsche = new Carro("EJA0V44", "Porsche 911");

//		HashMap<Carro, Proprietario> proprietarios = new LinkedHashMap<>();
        Map<Carro, Proprietario> proprietarios = new TreeMap<>();
		proprietarios.put(bmw, maria);
		proprietarios.put(honda, ana);
		proprietarios.put(ford, jose);
		proprietarios.put(porsche, maria);


		// Adição de chave nula (HashMap permite, Hashtable não)
		proprietarios.put(null, joao);
//		proprietarios.put(porsche, null);

        System.out.println(proprietarios);

//		for (var entry : proprietarios.entrySet()) {
//			System.out.printf("%s (%s) = %s%n", entry.getKey().getPlaca(),
//					entry.getKey().getModelo(), entry.getValue().getNome());
//		}

	}

}