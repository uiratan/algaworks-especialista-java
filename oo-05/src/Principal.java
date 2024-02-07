public class Principal {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.nome = "Uiratan";
        eu.cpf = "111.222.333-44";
        eu.anoNascimento = 1982;

        Pessoa voce = new Pessoa();
        voce.nome = "Liana";
        voce.cpf = "999.999.999-99";
        voce.anoNascimento = 1997;

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 1980;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.precoCompra = 0;
        meuCarro.proprietario = eu;

//        meuCarro.proprietario = new Pessoa();
//        meuCarro.proprietario.nome = "Uiratan";
//        meuCarro.proprietario.cpf = "111.222.333-44";
//        meuCarro.proprietario.anoNascimento = 1981;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.precoCompra = 980000;
        seuCarro.proprietario = voce;

        meuCarro.imprimirResumoDepreciacao();
        seuCarro.imprimirResumoDepreciacao();

//        System.out.println(meuCarro.calcularIpva());

//        double valorRevendaMeuCarro = meuCarro.calcularValorRevenda();
//        int tempoDeUsoMeuCarro = meuCarro.calcularTempoDeUsoEmAnos();
//
//        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoMeuCarro);
//        System.out.printf("Valor de revenda: %6.2f%n", valorRevendaMeuCarro);

//        seuCarro.calcularValorRevenda();

//        System.out.println("Meu carro");
//        System.out.println("------------");
//        System.out.printf("Modelo: %s%n", meuCarro.modelo);
//        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
//        System.out.printf("Proprietário: %s%n", meuCarro.proprietario.nome);
//
//        System.out.println();
//
//        System.out.println("Seu carro");
//        System.out.println("------------");
//        System.out.printf("Modelo: %s%n", seuCarro.modelo);
//        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
//        System.out.printf("Proprietário: %s%n", seuCarro.proprietario.nome);
    }
}
