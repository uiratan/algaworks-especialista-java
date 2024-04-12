package com.algaworks.c26optional;

import com.algaworks.c26optional.ciaaerea.Passageiro;
import com.algaworks.c26optional.ciaaerea.Reserva;
import com.algaworks.c26optional.ciaaerea.ServicoDeBagagem;
import com.algaworks.c26optional.ciaaerea.ServicoDeReserva;
import com.algaworks.c26optional.ciaaerea.Voo;

public class Principal {
    public static void main(String[] args) {
        var servicoDeReserva = new ServicoDeReserva();
        ServicoDeBagagem servicoDeBagagem = new ServicoDeBagagem(servicoDeReserva);
        var voo = new Voo("G31333", "UDI", "GRU");

        servicoDeReserva.adicionar(new Reserva("28A888", voo, "João da Silva"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Maria da Silva"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastião Coelho"));

        servicoDeBagagem.contratar("28A888", 10);
        
        Passageiro passageiro = servicoDeReserva.buscar("28A888")
            .filter(r -> r.getQuantidadeBagagens() > 0)
            .flatMap(Reserva::getPassageiro)
            .orElseThrow(RuntimeException::new);
        
        System.out.println(passageiro);


        // Reserva reserva = servicoDeReserva.buscar("28A888")
        //     .filter(r -> r.getQuantidadeBagagens() > 0)
        //     .orElseThrow(RuntimeException::new);

        // System.out.println(reserva);
    }
}
