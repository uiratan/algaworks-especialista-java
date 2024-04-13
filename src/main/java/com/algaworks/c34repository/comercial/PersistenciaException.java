package com.algaworks.c34repository.comercial;

public class PersistenciaException extends RuntimeException {

    public PersistenciaException(String mensagem) {
        super(mensagem);
    }   

    public PersistenciaException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    
    public PersistenciaException(Throwable causa) {
        super(causa);
    }

}
