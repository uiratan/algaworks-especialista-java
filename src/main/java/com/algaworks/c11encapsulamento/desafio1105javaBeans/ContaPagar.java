package com.algaworks.c11encapsulamento.desafio1105javaBeans;

import java.io.Serializable;

public class ContaPagar implements Serializable {

  private String descricao;
  private double valor;
  private String dataVencimento;
  private boolean pago;
  private Fornecedor fornecedor; // = new Fornecedor();

  public void pagar() {
      if (isPago()) {
          throw new RuntimeException("Não é possível pagar a mesma conta novamente.");
      }

      setPago(true);
  }

  public void cancelarPagamento() {
      if (!isPago()) {
          throw new RuntimeException("Não é possível cancelar o pagamento de uma conta pendente.");
      }

      setPago(false);
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public String getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public boolean isPago() {
    return pago;
  }

  public void setPago(boolean pago) {
    this.pago = pago;
  }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
