package com.algaworks.c14interfaces.financeira;


import com.algaworks.c14interfaces.financeira.modelo.Fazenda;
import com.algaworks.c14interfaces.financeira.modelo.Funcionario;
import com.algaworks.c14interfaces.financeira.modelo.Industria;
import com.algaworks.c14interfaces.financeira.service.ServicoFinanciamento;

public class Principal {
	public static void main(String[] args) {
		var servicoFinanciamento = new ServicoFinanciamento();

		var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
		var industria = new Industria("Alimentos da Vovó", 900_000, true);

		var funcionario = new Funcionario("João da Silva", 18_000);

		servicoFinanciamento.solicitarFinanciamento(funcionario, 90_000);
		servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
		servicoFinanciamento.solicitarFinanciamento(industria, 400_000);
	}
}
