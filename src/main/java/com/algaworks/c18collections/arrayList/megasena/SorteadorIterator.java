package com.algaworks.c18collections.arrayList.megasena;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class SorteadorIterator implements Iterator<Integer> {

	private static final Random RANDOM = new Random();
	private int quantidadeSorteada;
	private HashSet<Integer> numerosSorteados = new HashSet<>();

	@Override
	public boolean hasNext() {
		return quantidadeSorteada < 6;
	}

	@Override
	public Integer next() {
		if (!hasNext()) {
			throw new NoSuchElementException("Todos os números já foram sorteados");
		}

		var numerosSorteado = RANDOM.nextInt(60);

		if (numeroRepetido(numerosSorteado)) {
			return this.next();
		}

		quantidadeSorteada++;
//		System.out.println("Nao repetido " + numerosSorteado);
		return numerosSorteado;

	}

	private boolean numeroRepetido(int numerosSorteado) {
		return !numerosSorteados.add(numerosSorteado);
	}
}
