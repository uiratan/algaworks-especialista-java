package com.algaworks.c26optional.ciaaerea;

public class PrincipalPassageiroTeste {
    public static class Passageiro {

        private String name;
        private String sobreNome;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSobreNome() {
            return sobreNome;
        }

        public void setSobreNome(String sobreNome) {
            this.sobreNome = sobreNome;
        }
    }

    public static void main(String[] args) {

        PrincipalPassageiroTeste.Passageiro passageiro = new Passageiro();
        passageiro.setName("António");
        if(passageiro.getSobreNome().equalsIgnoreCase("Francisco")){
            System.out.println(passageiro.getSobreNome());
        }

    }

}
