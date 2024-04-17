package com.algaworks.c34repository.comercial.repositorio;

import java.io.IOException;
import java.util.Properties;

import com.algaworks.c34repository.comercial.repositorio.memoria.MemoriaFabricaDeRepositorio;
import com.algaworks.c34repository.comercial.repositorio.mysql.MySQLFabricaDeRepositorio;

public interface FabricaDeRepositorio extends AutoCloseable {

    public static FabricaDeRepositorio obterInstancia() {

        Properties properties = new Properties();

        try (var is = FabricaDeRepositorio.class.getResourceAsStream("/persistencia.properties")) {
            System.out.println("Configurações de persistência carregadas com êxito.");

            properties.load(is);
            properties.forEach((k, v) -> System.out.println(k + " = " + v));

            var repostorioProp = properties.getProperty("repositorio");
            System.out.println("Usando persistencia em: " + repostorioProp);


            if ("mysql".equals(repostorioProp)) {
                return new MySQLFabricaDeRepositorio(properties);
            } else if ("memoria".equals(repostorioProp)) {
                return new MemoriaFabricaDeRepositorio();
            }

            throw new PersistenciaException("Configuração de persistência inválida: " + repostorioProp);

        } catch (IOException e) {
            throw new PersistenciaException("Erro carregando configurações de persistência.", e);
        }

    }


    VendaRepositorio criarVendaRepositorio();

    @Override
    void close();

}