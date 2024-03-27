package com.algaworks.c12heranca;

import com.algaworks.c12heranca.banco.Conta;
import com.algaworks.c12heranca.banco.Titular;

public class PrincipalNormal {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "12312312300");
        Conta conta1 = new Conta(titular, 1234, 999999);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(27.5);
        conta1.imprimirDemonstrativo();
    }

}