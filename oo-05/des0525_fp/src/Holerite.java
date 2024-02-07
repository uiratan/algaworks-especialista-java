public class Holerite {
    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double valorAdicionalFilhos;

    double calcularValorTotal() {
        return valorTotalHorasNormais + valorTotalHorasExtras + valorAdicionalFilhos;
    }

    void imprimir() {
        System.out.printf("HOLERITE: %s%n", funcionario.nome);
        System.out.println("============================================");
        System.out.printf("Valor Total Horas Normais Trabalhadas: %.2f%n", valorTotalHorasNormais);
        System.out.printf("Valor Total Horas Extras Trabalhadas: %.2f%n", valorTotalHorasExtras);
        System.out.printf("Valor Total Horas Trabalhadas: %.2f%n", valorTotalHorasNormais + valorTotalHorasExtras);
        System.out.printf("Valor Total Adicional Filhos (%d%%): %.2f%n", funcionario.qtdFilhos * 10, valorAdicionalFilhos);
        System.out.printf("Valor Total: %.2f%n", calcularValorTotal());
    }
}
