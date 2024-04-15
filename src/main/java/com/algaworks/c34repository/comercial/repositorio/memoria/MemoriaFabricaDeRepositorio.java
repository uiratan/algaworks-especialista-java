package com.algaworks.c34repository.comercial.repositorio.memoria;

import com.algaworks.c34repository.comercial.repositorio.FabricaDeRepositorio;
import com.algaworks.c34repository.comercial.repositorio.VendaRepositorio;

public class MemoriaFabricaDeRepositorio implements FabricaDeRepositorio {

    @Override
    public VendaRepositorio criarVendaRepositorio() {
        return new MemoriaVendaRepositorio();
    }

    @Override
    public void close() {
    }

}
