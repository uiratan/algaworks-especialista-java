import com.algaworks.estoque.Produto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		var produto = new Produto("Apple Watch");
//		var produto1 = new Produto(null);
		produto.adicionarEstoque(10);
		produto.ativar();
//		produto.retirarEstoque(15);
//		System.out.printf("Estoque: %d%n", produto.getQuantidadeEstoque());

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
				e.printStackTrace();
//				e.printStackTrace(System.out);
				System.out.println("Erro na compra: " + e.getMessage());
			}
		} while (true);
	}

	public static void efetuarBaixaEstoque(Produto produto, int quantidade) {
//		try {
			produto.retirarEstoque(quantidade);
			System.out.printf("%d unidades retiradas do estoque, Estoque atual: %d%n",
					quantidade, produto.getQuantidadeEstoque());
//		} catch (IllegalArgumentException e) {
//			System.out.println("Erro ao efetuar baixa no estoque: " + e.getMessage());
//			throw e;
//		}
	}
}
