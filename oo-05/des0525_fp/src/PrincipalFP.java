public class PrincipalFP {
    public static void main(String[] args) {
        int horas = 40;
        int horasExtras = 5;

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Uiratan";
        funcionario.qtdFilhos = 2;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHora = 100;
        contratoTrabalho.valorHoraExtra = 150;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Holerite holerite = folhaPagamento.calcularSalario(contratoTrabalho, horas, horasExtras);

        holerite.imprimir();
    }

}
