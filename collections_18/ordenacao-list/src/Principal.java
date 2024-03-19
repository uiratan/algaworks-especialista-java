import com.algaworks.agencia.CadastroHotel;
import com.algaworks.agencia.Hotel;

import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		CadastroHotel cadastro = new CadastroHotel();
		cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
		cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1300);
		cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 1300);
		cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
		cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

		List<Hotel> hoteis = cadastro.obterTodos();
//		cadastro.ordenar();

		cadastro.ordenarPorPreco();

		imprimirHoteis(hoteis);
	}

	private static void imprimirHoteis(List<Hotel> hoteis) {
		// enhanced for
		for (Hotel hotel : hoteis) {
			System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
					hotel.getCidade(), hotel.getPrecoDiaria());
		}

	}

}