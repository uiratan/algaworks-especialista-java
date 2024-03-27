package com.algaworks.c18collections.desafioList.agencia;

import java.util.*;

public class CadastroPacoteViagem {

	private final List<PacoteViagem> pacotes = new ArrayList<>();

	public void adicionar(String descricao, double precoDiaria) {
		PacoteViagem pacoteViagem = new PacoteViagem(descricao, precoDiaria);
		if (pacoteJaCadastrado(pacoteViagem)) {
			throw new PacoteViagemJaExistenteException("Pacote já existe");
		}
		pacotes.add(pacoteViagem);
	}

	private boolean pacoteJaCadastrado(PacoteViagem pacoteViagem) {
		return pacotes.contains(pacoteViagem);
	}

	public List<PacoteViagem> obterTodos() {
		return pacotes;
	}

	public void ordenar() {
		Collections.sort(pacotes);
	}

	public void ordenarPorPrecoDecrescente() {
		pacotes.sort(new PrecoPacoteViagemComparator().reversed());
	}

	public void removerPorDescricao(String descricao) {
		boolean encontrado = false;
		Iterator<PacoteViagem> pacoteViagemIterator = pacotes.iterator();

		while (pacoteViagemIterator.hasNext()) {
			var pacoteViagem = pacoteViagemIterator.next();
			if (pacoteViagem.getDescricao().equals(descricao)) {
				pacoteViagemIterator.remove();
				encontrado = true;
			}
		}

		if (!encontrado) {
			throw new PacoteViagemNaoEncontradoException("Pacote não encontrado");
		}

	}

	public PacoteViagem buscarPorDescricao(String descricao) {
		for (PacoteViagem pacoteViagem : pacotes) {
			if (pacoteViagem.getDescricao().equals(descricao)) {
				return pacoteViagem;
			}
		}

		throw new PacoteViagemNaoEncontradoException("Pacote não encontrado");
	}

}