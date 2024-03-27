package com.algaworks.c11encapsulamento.desafio1105javaBeans;

public class Fornecedor {
  private String nome;

  public Fornecedor() {}

  public Fornecedor(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
