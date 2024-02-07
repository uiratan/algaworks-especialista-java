package src.com.algaworks.contaspagar.servico;

import src.com.algaworks.pagamento.DocumentoPagavel;
import src.com.algaworks.pagamento.MetodoPagamento;


public class ServicoContaPagar {

	private MetodoPagamento metodoPagamento;

	public ServicoContaPagar(MetodoPagamento metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public void pagar(DocumentoPagavel documento) {
		metodoPagamento.pagar(documento);
	}
}
