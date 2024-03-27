package com.algaworks.c14interfaces.desafioSeguradoda;


import com.algaworks.c14interfaces.desafioSeguradoda.modelo.Caminhao;
import com.algaworks.c14interfaces.desafioSeguradoda.modelo.CarroParticular;
import com.algaworks.c14interfaces.desafioSeguradoda.modelo.ImovelResidencial;
import com.algaworks.c14interfaces.desafioSeguradoda.service.ServicoPropostaSeguro;

public class Principal {
	public static void main(String[] args) {
		var servicoPropostaSeguro = new ServicoPropostaSeguro();

		var carroParticular = new CarroParticular("HR-V", 2022, 150_000);
		var caminhao = new Caminhao("Actros", 2021, 780_000, 4);
		var imovelResidencial = new ImovelResidencial(2_300_000, 320);

		servicoPropostaSeguro.emitir(carroParticular);
		servicoPropostaSeguro.emitir(caminhao);
		servicoPropostaSeguro.emitir(imovelResidencial);
	}
}
