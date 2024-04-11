package com.algaworks.c25interfacesFuncionais.estoque;

public class ServicoInativacaoProduto {
    public void processar(Produto produto) {
        System.out.println("Inativando o produto: " + produto.getNome());
        produto.inativar();
    }
}
