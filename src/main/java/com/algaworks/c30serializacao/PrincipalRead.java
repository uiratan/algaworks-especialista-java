package com.algaworks.c30serializacao;

import static java.nio.file.StandardOpenOption.READ;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class PrincipalRead {

    public static void main(String[] args) {
        Path path = Path.of(
                "/mnt/wsl/PHYSICALDRIVE1/algaworks/especialista-java/src/main/java/com/algaworks/c30serializacao/objetos/joao.ser");

        try (var inputStream = new ObjectInputStream(Files.newInputStream(path, READ))) {
            Funcionario funcionario = (Funcionario) inputStream.readObject();
            System.out.println(funcionario);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
