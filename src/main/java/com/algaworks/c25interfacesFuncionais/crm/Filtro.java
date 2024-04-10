package com.algaworks.c25interfacesFuncionais.crm;

@FunctionalInterface
public interface Filtro<T> {
	boolean avaliar(T objeto);
}
