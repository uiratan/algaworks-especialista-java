package src.com.algaworks;

import src.com.algaworks.contaspagar.modelo.Holerite;
import src.com.algaworks.contaspagar.modelo.OrdemServico;
import src.com.algaworks.contaspagar.servico.ServicoContaPagar;
import src.com.algaworks.pagamento.Beneficiario;
import src.com.algaworks.pagamento.MetodoPagamento;
import src.com.algaworks.pagamento.Pix;
import src.com.algaworks.pagamento.Transferencia;

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
