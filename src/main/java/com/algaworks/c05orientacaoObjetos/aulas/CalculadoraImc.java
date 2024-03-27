package com.algaworks.c05orientacaoObjetos.aulas;

public class CalculadoraImc {

    IndiceMassaCorporal calcular(Paciente paciente) {
        double peso = paciente.peso;
        double altura = paciente.altura;

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }

}
