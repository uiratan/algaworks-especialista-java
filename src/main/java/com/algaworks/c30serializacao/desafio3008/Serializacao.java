package com.algaworks.c30serializacao.desafio3008;


import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;

import com.algaworks.c30serializacao.desafio3008.crm.Cliente;
import com.algaworks.c30serializacao.desafio3008.crm.Endereco;

public class Serializacao {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Ameixas", "1000", "Centro");
        Cliente cliente = new Cliente("João da Silva", endereco, new BigDecimal("100000"));

        System.out.println(cliente);

        Path path = Path.of(
                "/mnt/wsl/PHYSICALDRIVE1/algaworks/especialista-java/src/main/java/com/algaworks/c30serializacao/desafio3008/crm/cliente");

        try (var outputStream = new ObjectOutputStream(
                                        Files.newOutputStream(path, WRITE, CREATE))) {
            outputStream.writeObject(cliente);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}