package com.algaworks.c18collections.listOrdenacao;


import com.algaworks.c18collections.listOrdenacao.agencia.Hotel;

public class Principal2 {

	public static void main(String[] args) {
		var hotel1 = new Hotel("Vila Selvagem", "Fortim/CE", 1500);
		var hotel2 = new Hotel("Vila Selvagem", "Fortim/CE", 1400);

		System.out.println(hotel1.compareTo(hotel2));
	}
}
