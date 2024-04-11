package com.algaworks.c26optional;

import java.util.Optional;
import java.util.function.Supplier;

import com.algaworks.c26optional.ciaaerea.Reserva;
import com.algaworks.c26optional.ciaaerea.ServicoDeBagagem;
import com.algaworks.c26optional.ciaaerea.ServicoDeReserva;
import com.algaworks.c26optional.ciaaerea.Voo;

public class Principal {
    public static void main(String[] args) {
        var servicoDeReserva = new ServicoDeReserva();
        var servicoDeBagagem = new ServicoDeBagagem(servicoDeReserva);
        var voo = new Voo("G31333", "UDI", "GRU");

        servicoDeReserva.adicionar(new Reserva("28A888", voo, "João da Silva"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Maria da Silva"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastião Coelho"));

        // Reserva reserva = servicoDeReserva.buscar("28A888").orElse(null);
        // Reserva reserva = servicoDeReserva.buscar("28A888X").orElse(new Reserva("000", voo, "Não informado"));
        // Reserva reserva = servicoDeReserva.buscar("28A888X").orElseGet(() -> new Reserva("000", voo, "Não informado"));

        Supplier<Reserva> reservaNaoExiste = () -> new Reserva("000", voo, "Não informado");
        Reserva reserva = servicoDeReserva.buscar("28A888", reservaNaoExiste);
        System.out.println(reserva);

    }
}
