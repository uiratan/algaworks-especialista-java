import com.algaworks.estoque.Produto;
import com.algaworks.estoque.ProdutoException;
import com.algaworks.estoque.ProdutoInativoException;
import com.algaworks.estoque.ProdutoSemEstoqueException;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		var produto = new Produto("Apple Watch");
//		produto.ativar();
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

			} catch (IllegalArgumentException e) {
				System.out.println("Erro na compra: " + e.getMessage());

//			} catch (ProdutoSemEstoqueException e) {
//				System.out.printf("Erro na compra: %s. Estoque disponível: %d. Estoque necessário: %d%n",
//						e.getMessage(), e.getEstoqueDisponivel(), e.getEstoqueNecessario());

			} catch (ProdutoInativoException e) {
				System.out.println("Erro na compra: " + e.getMessage());

				System.out.print("Deseja ativar o produto? ");

				if (scanner.nextBoolean()) {
					produto.ativar();
					System.out.println("Ok. Produto foi ativado.");
				} else {
					System.out.println("Ok. Compra não pode ser realizada.");
					break;
				}

			} catch (ProdutoException e) {
				System.out.println("Erro na compra: " + e.getMessage());
			}

		} while (true);
	}

	public static void efetuarBaixaEstoque(Produto produto, int quantidade) throws ProdutoSemEstoqueException, ProdutoInativoException {
		produto.retirarEstoque(quantidade);
		System.out.printf("%d unidades retiradas do estoque, Estoque atual: %d%n",
				quantidade, produto.getQuantidadeEstoque());
	}
}
