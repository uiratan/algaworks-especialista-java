public class ContratoTrabalho {
    Funcionario funcionario;
    double valorHora;
    double valorHoraExtra;
    double porcentagemAdicionalPorFilho = 0.1;

    double calcularPercentualAdicionalFilhos() {
        return funcionario.qtdFilhos * porcentagemAdicionalPorFilho;
    }

    boolean possuiAdicionalFilhos() {
        return funcionario.possuiFilhos();
    }
}
