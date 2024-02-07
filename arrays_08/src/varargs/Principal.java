package varargs;

public class Principal {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1_293.55;

        ServicoDeCobranca servicoDeCobranca = new ServicoDeCobranca();
//        servicoDeCobranca.pagar(fatura);

        servicoDeCobranca.pagar(fatura, "uiratan@gmail.com", "maria@gmail.com", "joao@gmail.com");
    }
}

