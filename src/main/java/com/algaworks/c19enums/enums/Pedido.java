package com.algaworks.c19enums.enums;

public class Pedido {

    private String nomeCliente;
    private double valorTotal;
    private StatusPedido status = StatusPedido.RASCUNHO;
    private OrigemPedido origem = OrigemPedido.BALCAO;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valor) {
        this.valorTotal = valor;
    }

    
    public StatusPedido getStatus() {
        return status;
    }

    public OrigemPedido getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemPedido origem) {
        this.origem = origem;
    }

    public int getTempoEntregaEmHoras() {
        return status.getTempoEntregaEmHoras();
    }

    public void marcarComoEntregue() {
        status = StatusPedido.ENTREGUE;
    }

    public void emitir() {
        status = StatusPedido.EMITIDO;
    }

    public void cancelar() {
        if (getStatus().podeMudarParaCancelado(getValorTotal())) {
            status = StatusPedido.CANCELADO;
        } else {
            throw new IllegalStateException("Pedido não pode ser cancelado");
        }
    }

}