package com.algaworks.c25interfacesFuncionais;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PrincipaisInterfacesFuncionais {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.startsWith("U");
        System.out.println(predicate.test("Liana"));

        Function<String, LocalDate> function = (s) -> LocalDate.parse(s);
        System.out.println(function.apply("2022-01-01"));

        Supplier<LocalDate> supplier = () -> LocalDate.now();
        System.out.println(supplier.get());

        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Liana");
    }
}
