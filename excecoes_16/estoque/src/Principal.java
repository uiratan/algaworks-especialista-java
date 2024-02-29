import com.algaworks.estoque.*;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		var produto = new Produto("Apple Watch");
		produto.ativar();
		produto.adicionarEstoque(20);
		comprar(produto);
	}

	public static void comprar(Produto produto) {
		var scanner = new Scanner(System.in);

		do {
			try {
				System.out.print("Quantidade: ");
				var quantidade = scanner.nextInt();

				efetuarBaixaEstoque(produto, quantidade);
				System.out.println("Compra realizada");

				break;

			} catch (BaixaEstoqueException e) {
				System.out.println("Erro na compra: " + e.getMessage());
				System.out.println("Detalhe: " + e.getCause().getMessage());
			}

		} while (true);
	}

	public static void efetuarBaixaEstoque(Produto produto, int quantidade) throws BaixaEstoqueException {

		try {
			produto.retirarEstoque(quantidade);
			System.out.printf("%d unidades retiradas do estoque, Estoque atual: %d%n",
					quantidade, produto.getQuantidadeEstoque());

		} catch (IllegalArgumentException | ProdutoException e) {
			throw new BaixaEstoqueException("Erro ao realizar baixa no estoque.", e);
		}

	}
}
