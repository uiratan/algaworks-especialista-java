package com.algaworks.c16excecoes.anuncios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ServicoCadastroAnuncio {

	public void cadastrar(String codigo, String descricao) {
		Path arquivo = Path.of("/mnt/wsl/PHYSICALDRIVE1/java/algaworks/ej/excecoes_16/excecoes/asd", codigo + ".txt");

		try {
			Files.writeString(arquivo, descricao);
		} catch (IOException e) {
			throw new CadastroAnuncioException("Erro escrevendo arquivo.", e);
		}
	}
}
