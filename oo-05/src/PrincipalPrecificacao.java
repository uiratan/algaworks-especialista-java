public class PrincipalPrecificacao {
    public static void main(String[] args) {
        Produto.custoEmbalagem = 10;
        Produto novoProduto = new Produto();
        novoProduto.alterarPrecoCusto(100);
//        double precoCompraFornecedor = 140;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.calcularPrecoVenda(novoProduto, 20);

        System.out.printf("Preço de custo: %.2f%n", novoProduto.precoCusto);
        System.out.printf("Preço de venda: %.2f%n", novoProduto.precoVenda);
    }
}
