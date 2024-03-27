package com.algaworks.c14interfaces.contaspagar.servico;


import com.algaworks.c14interfaces.contaspagar.pagamento.DocumentoPagavel;
import com.algaworks.c14interfaces.contaspagar.pagamento.MetodoPagamento;

public class ServicoContaPagar {

	private MetodoPagamento metodoPagamento;

	public ServicoContaPagar(MetodoPagamento metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public void pagar(DocumentoPagavel documento) {
		metodoPagamento.pagar(documento);
	}
}
