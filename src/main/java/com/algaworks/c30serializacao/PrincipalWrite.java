package com.algaworks.c30serializacao;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;

public class PrincipalWrite {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", LocalDate.of(2005, Month.MARCH, 20),
                new BigDecimal("25000"));

        System.out.println(funcionario);

        Path path = Path.of(
                "/mnt/wsl/PHYSICALDRIVE1/algaworks/especialista-java/src/main/java/com/algaworks/c30serializacao/objetos/joao.ser");

        try (var outputStream = new ObjectOutputStream(
                                        Files.newOutputStream(path, WRITE, CREATE))) {
            outputStream.writeObject(funcionario);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
