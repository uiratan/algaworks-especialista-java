package com.algaworks.agencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CadastroHotel {
	private final List<Hotel> hoteis = new ArrayList<>();

	public void adicionar(String nome, String cidade, double precoDiaria) {
		var hotel = new Hotel(nome, cidade, precoDiaria);
		if (hoteis.contains(hotel)) {
			throw new HotelJaExistenteException("Hotel já foi adicionado");
		}
		hoteis.add(hotel);
	}

	public List<Hotel> obterTodos() {
		return hoteis;
	}

	public Hotel[] obterTodosComoArray() {
		return hoteis.toArray(new Hotel[0]);
//		Hotel[] hoteisArray = new Hotel[hoteis.size()];
//		for (int i = 0; i < hoteis.size(); i++) {
//			hoteisArray[i] = hoteis.get(i);
//		}
//		return hoteisArray;
	}

	public void ordenar() {
		Collections.sort(hoteis);
	}

	public void removerPorCidade(String cidade) {
		Iterator<Hotel> hotelIterator = hoteis.iterator();
		while (hotelIterator.hasNext()) {
			var hotel = hotelIterator.next();
			if (hotel.getCidade().equals(cidade)) {
				hotelIterator.remove();
			}
		}

	}

	public void remover(Hotel hotel) {
		var removido = hoteis.remove(hotel);

		if (!removido) {
			throw new HotelNaoEncontradoException("Hotel não encontrado para remoçao");
		}
	}

	public void removerTodos() {
		hoteis.clear();
	}

}