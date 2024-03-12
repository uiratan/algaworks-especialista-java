package com.algaworks.agencia;

import java.util.ArrayList;

public class CadastroHotel {
	private final ArrayList<Hotel> hoteis = new ArrayList<>();

	public void adicionar(String nome, String cidade, double precoDiaria) {
		var hotel = new Hotel(nome, cidade, precoDiaria);
		if (hoteis.contains(hotel)) {
			throw new HotelJaExistenteException("Hotel já foi adicionado");
		}
		hoteis.add(hotel);
	}

	public ArrayList<Hotel> obterTodos() {
		return hoteis;
	}

}