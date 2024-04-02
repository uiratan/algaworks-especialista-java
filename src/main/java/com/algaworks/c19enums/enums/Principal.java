package com.algaworks.c19enums.enums;

public class Principal {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
        pedido.setStatus(StatusPedido.EMITIDO);

        

        // pedido.setOrigem(OrigemPedido.BALCAO);

        // System.out.println(pedido.getStatus());
        // System.out.println(pedido.getOrigem());

        // System.out.println(StatusPedido.EMITIDO.ordinal());
        // System.out.println(StatusPedido.EMITIDO.name());
        // System.out.println(StatusPedido.EMITIDO);

        // for (StatusPedido status : StatusPedido.values()) {
        //     System.out.printf("%d - %s%n", status.ordinal(), status.name());
        // }

        // String textoStatus = "CANCELADO";
        // StatusPedido status = StatusPedido.valueOf(textoStatus);
        // System.out.println(status.ordinal() + " - " + status.name());

        // int numero = 5;
        // StatusPedido status = StatusPedido.values()[numero];
        // System.out.println(status.ordinal() + " - " + status.name());

    }

}