package com.algaworks.c05orientacaoObjetos.des0525_fp;

public class FolhaPagamento {
    Holerite calcularSalario(ContratoTrabalho contrato, int horasNormaisTrabalhadas, int horasExtrasTrabalhadas) {
        Holerite holerite = new Holerite();
        holerite.funcionario = contrato.funcionario;
        holerite.valorTotalHorasNormais = horasNormaisTrabalhadas * contrato.valorHora;
        holerite.valorTotalHorasExtras = horasExtrasTrabalhadas * contrato.valorHoraExtra;

        if (contrato.possuiAdicionalFilhos()) {
            double valorHorasTrabalhadas = holerite.valorTotalHorasNormais + holerite.valorTotalHorasExtras;
            holerite.valorAdicionalFilhos = calcularValorAdicionalFilhos(contrato, valorHorasTrabalhadas);
        }

        return holerite;
    }

    private static double calcularValorAdicionalFilhos(ContratoTrabalho contrato, double valorHorasTrabalhadas) {
        return contrato.calcularPercentualAdicionalFilhos() * valorHorasTrabalhadas;
    }
}
