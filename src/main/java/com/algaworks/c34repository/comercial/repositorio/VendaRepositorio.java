package com.algaworks.c34repository.comercial.repositorio;

import java.util.List;

import com.algaworks.c34repository.comercial.entidade.Venda;

public interface VendaRepositorio {

    Venda adicionar(Venda venda);

    List<Venda> consultar();

}