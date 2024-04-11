package com.algaworks.c26optional.ciaaerea;

public class ReservaNaoEncontradaException extends RuntimeException {

    public ReservaNaoEncontradaException() {
        super();
    }

    public ReservaNaoEncontradaException(String message) {
        super(message);
    }

    public static ReservaNaoEncontradaException erroReservaInexistente() {
        return new ReservaNaoEncontradaException("Reserva não existe");
    }
}
