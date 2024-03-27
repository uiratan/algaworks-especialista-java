package com.algaworks.c18collections.arrayList.agencia;

import java.util.ArrayList;
import java.util.Iterator;

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

	public void removerPorCidade(String cidade) {
		Iterator<Hotel> hotelIterator = hoteis.iterator();
		while (hotelIterator.hasNext()) {
			var hotel = hotelIterator.next();
			if (hotel.getCidade().equals(cidade)) {
				hotelIterator.remove();
			}
		}
//		ArrayList<Hotel> hoteisParaRemocao = new ArrayList<>();

//		for (int i = 0; i < hoteis.size(); i++) {
//			var hotel = hoteis.get(i);
//			if (hotel.getCidade().equals(cidade)) {
//				hoteisParaRemocao.add(hotel);
////				hoteis.remove(i);
////				i--;
//			}
//		}

//		hoteis.removeAll(hoteisParaRemocao);
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