package com.algaworks.c08arrays.desafio0810;

public class Calendario {

    public static void main(String[] args) {
        String mes = Calendario.obterNomeMes(12);

        System.out.println(mes);
    }

    public static String obterNomeMes(int numeroMes) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return meses[numeroMes-1];
    }
}
