package com.algaworks.c30serializacao;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario implements Serializable {

    @Serial
    private static final long serialVersionUID = -1463350243628007010L;

    private Integer codigo;
    private String nome;
    private LocalDate dataNascimento;
    private transient BigDecimal salario;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public void testar() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Funcionario [codigo=" + codigo + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", salario="
                + salario + "]";
    }

}
