package com.algaworks.c26optional.ciaaerea;

import java.util.Objects;
import java.util.Optional;

public class ServicoDeBagagem {

    public ServicoDeReserva servicoDeReserva;

    public ServicoDeBagagem(ServicoDeReserva servicoDeReserva) {
        Objects.requireNonNull(servicoDeReserva);
        this.servicoDeReserva = servicoDeReserva;
    }

    public void contratar(String codigoReserva, int quantidadeBagagens) {
        if (quantidadeBagagens <= 0) {
            throw new IllegalArgumentException("Quantidade de bagagens inválida");
        }

        // servicoDeReserva.buscar(codigoReserva)
        //     .orElseThrow(ReservaNaoEncontradaException::new)
        //     .adicionarBagagens(quantidadeBagagens);
        
        // servicoDeReserva.buscar(codigoReserva)
        //     .orElseThrow(() -> new ReservaNaoEncontradaException("Reserva não encontrada: " + codigoReserva))
        //     .adicionarBagagens(quantidadeBagagens);

        servicoDeReserva.buscar(codigoReserva)
        .orElseThrow(ReservaNaoEncontradaException::erroReservaInexistente)
        .adicionarBagagens(quantidadeBagagens);
    }

}
