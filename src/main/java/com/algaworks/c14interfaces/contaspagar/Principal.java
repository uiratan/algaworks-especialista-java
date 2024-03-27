package com.algaworks.c14interfaces.contaspagar;

import com.algaworks.c14interfaces.contaspagar.modelo.Holerite;
import com.algaworks.c14interfaces.contaspagar.modelo.OrdemServico;
import com.algaworks.c14interfaces.contaspagar.pagamento.Beneficiario;
import com.algaworks.c14interfaces.contaspagar.pagamento.MetodoPagamento;
import com.algaworks.c14interfaces.contaspagar.pagamento.Transferencia;
import com.algaworks.c14interfaces.contaspagar.servico.ServicoContaPagar;

public class Principal {

	public static void main(String[] args) {
		MetodoPagamento metodoPagamento = new Transferencia();
		ServicoContaPagar servicoContaPagar = new ServicoContaPagar(metodoPagamento);

		Beneficiario funcionario = new Beneficiario("João da Silva", "86981921010", "999999");
		Holerite holerite = new Holerite(funcionario, 100, 168);

		Beneficiario fornecedor = new Beneficiario("Consultoria XYZ", "1068799000187", "888888");
		OrdemServico os = new OrdemServico(fornecedor, 65_000);

		servicoContaPagar.pagar(holerite);
		servicoContaPagar.pagar(os);
	}
}
