package com.algaworks.c09jvm.aula98;

public class Teste2 {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.imprimirEstatisticas();

        pilha.adicionar(new Cliente());
        pilha.adicionar(new Cliente());
        pilha.adicionar(new Cliente());
        pilha.adicionar(new Cliente());
        pilha.adicionar(new Cliente());
        pilha.adicionar(new Cliente());

        Cliente clienteRetirado = null;

        do {
            clienteRetirado = pilha.retirar();
            pilha.imprimirEstatisticas();
        } while (clienteRetirado != null);

        @SuppressWarnings("unused")
        Cliente c1 = new Cliente();
        @SuppressWarnings("unused")
        Cliente c2 = new Cliente();
        @SuppressWarnings("unused")
        Cliente c3 = new Cliente();
    }

}