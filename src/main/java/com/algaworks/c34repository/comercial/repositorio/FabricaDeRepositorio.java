package com.algaworks.c34repository.comercial.repositorio;

import com.algaworks.c34repository.comercial.repositorio.memoria.MemoriaFabricaDeRepositorio;
import com.algaworks.c34repository.comercial.repositorio.mysql.MySQLFabricaDeRepositorio;

public interface FabricaDeRepositorio extends AutoCloseable {

    public static FabricaDeRepositorio obterInstancia() {
        // return new MemoriaFabricaDeRepositorio();
        return new MySQLFabricaDeRepositorio();
    }

    VendaRepositorio criarVendaRepositorio();

    @Override
    void close();

}