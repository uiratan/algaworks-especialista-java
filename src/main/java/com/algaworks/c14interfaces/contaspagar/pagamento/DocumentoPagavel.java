package com.algaworks.c14interfaces.contaspagar.pagamento;

public interface DocumentoPagavel {
	// em interfaces: public abstract é opcional

	public abstract double getValorTotal();

	Beneficiario getBeneficiario();

}
