package com.algaworks.fiscal;

public class NotaFiscalServico extends NotaFiscal {

    public static final int VALOR_MAXIMO_ISENCAO_FISCAL = 1_000;
    public static final double ALIQUOTA_IMPOSTOS = 0.18;

    private boolean intermunicipal;

    public NotaFiscalServico(String descricao, double valorTotal, boolean intermunicipal) {
        super(descricao, valorTotal);
        this.intermunicipal = intermunicipal;
    }

    public boolean isIntermunicipal() {
        return intermunicipal;
    }

    @Override
    public double calcularImpostos() {
        if (isIsentoImpostos()) {
            return 0;
        }

        return getValorTotal() * ALIQUOTA_IMPOSTOS;
    }

    private boolean isIsentoImpostos() {
        return isIntermunicipal() && getValorTotal() <= VALOR_MAXIMO_ISENCAO_FISCAL;
    }

}