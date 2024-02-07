public class PrincipalProd2 {
    public static void main(String[] args) {
        Produto.alterarCustoEmbalagem(10);

        Produto produto = new Produto();
        produto.alterarPrecoCusto(100);

        System.out.println(Produto.calcularCustosTotais(produto));

    }
}
