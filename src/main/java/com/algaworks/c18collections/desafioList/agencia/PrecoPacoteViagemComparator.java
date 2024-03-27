package com.algaworks.c18collections.desafioList.agencia;

import java.util.Comparator;

public class PrecoPacoteViagemComparator implements Comparator<PacoteViagem> {
	@Override
	public int compare(PacoteViagem o1, PacoteViagem o2) {
		return Double.compare(o1.getPrecoPorPessoa(), o2.getPrecoPorPessoa());
	}
}
