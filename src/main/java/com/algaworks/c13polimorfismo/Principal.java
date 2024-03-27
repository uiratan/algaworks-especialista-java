package com.algaworks.c13polimorfismo;

import com.algaworks.c13polimorfismo.fiscal.GestorFiscal;
import com.algaworks.c13polimorfismo.fiscal.NotaFiscalProduto;
import com.algaworks.c13polimorfismo.fiscal.NotaFiscalServico;

public class Principal {

    public static void main(String[] args) {
        var gestorFiscal = new GestorFiscal();
//        var nf = new NotaFiscal("Abc", 500);

        var nfBolaFutebol = new NotaFiscalProduto("Bola Futebol", 300, 50);
        var nfReparoMotor = new NotaFiscalServico("Reparo da roda", 1100, true);

//        gestorFiscal.emitirNotasFiscais(nf, nfBolaFutebol, nfReparoMotor);
        gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoMotor);

//        System.out.println(nfBolaFutebol.calcularImpostos());
//        System.out.println(nfReparoMotor.calcularImpostos());
    }

}
