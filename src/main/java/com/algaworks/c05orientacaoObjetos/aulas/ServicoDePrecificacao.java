package com.algaworks.c05orientacaoObjetos.aulas;

public class ServicoDePrecificacao {

    void calcularPrecoVenda(Produto produto, double percentualMargemLucro) {
        double precoVendaCalculado = MatematicaUtil.calcularAcrescimo(
            produto.precoCusto, percentualMargemLucro);

        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;
    }
}
