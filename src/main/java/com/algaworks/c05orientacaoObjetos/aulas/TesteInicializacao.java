package com.algaworks.c05orientacaoObjetos.aulas;

public class TesteInicializacao {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.fabricante = "Honda";
        meuCarro.anoFabricacao = 2021;
        meuCarro.proprietario.nome = "Maria";

        @SuppressWarnings("unused")
        Pessoa proprietarioAntigo = meuCarro.proprietario;

        meuCarro.proprietario = new Pessoa();

        System.out.println(meuCarro.fabricante);
        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.anoFabricacao);
        System.out.println(meuCarro.proprietario.nome);
    }
}
