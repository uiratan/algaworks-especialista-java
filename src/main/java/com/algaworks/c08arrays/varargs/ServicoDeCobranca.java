package com.algaworks.c08arrays.varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ServicoDeCobranca {

    void pagar(Fatura fatura, String emailCobranca, String... emailsAdicionais) {
        Objects.requireNonNull(fatura, "Informe a fatura");
        Objects.requireNonNull(emailCobranca, "Informe o e-mail de cobrança");

        System.out.printf("Fatura %d, no valor de R$ %.2f, foi paga!%n",
            fatura.numero, fatura.valorTotal);

        ArrayList<String> emails = new ArrayList<>();
        emails.add(emailCobranca);
        emails.addAll(List.of(emailsAdicionais));

        for (String email : emails) {
            enviarNotificacao(fatura, email);
        }
    }

    private void enviarNotificacao(Fatura fatura, String email) {
        System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
    }
}
