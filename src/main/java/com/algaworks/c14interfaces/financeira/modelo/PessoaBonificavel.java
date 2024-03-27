package com.algaworks.c14interfaces.financeira.modelo;

public interface PessoaBonificavel extends ClienteFinanciavel {
	double calcularBonus(double percentualMetaAlcancada);
}
