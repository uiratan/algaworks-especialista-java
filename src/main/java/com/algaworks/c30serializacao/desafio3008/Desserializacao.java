package com.algaworks.c30serializacao.desafio3008;

import static java.nio.file.StandardOpenOption.READ;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import com.algaworks.c30serializacao.desafio3008.crm.Cliente;

public class Desserializacao {
    public static void main(String[] args) {
        Path path = Path.of(
            "/mnt/wsl/PHYSICALDRIVE1/algaworks/especialista-java/src/main/java/com/algaworks/c30serializacao/desafio3008/crm/cliente");

        try (var inputStream = new ObjectInputStream(Files.newInputStream(path, READ))) {
            Cliente cliente = (Cliente) inputStream.readObject();
            System.out.println(cliente);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
