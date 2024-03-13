import com.algaworks.agencia.CadastroHotel;
import com.algaworks.agencia.Hotel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) {
		CadastroHotel cadastro = new CadastroHotel();
		cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
		cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
		cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
		cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
		cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

//		cadastro.removerPorCidade("Fortim/CE");

		Vector<Hotel> hoteis = cadastro.obterTodos();

		imprimirHoteis(hoteis);
	}

	private static void imprimirHoteis(Vector<Hotel> hoteis) {
		// enhanced for
		for (Hotel hotel : hoteis) {
			System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
					hotel.getCidade(), hotel.getPrecoDiaria());
		}


//		ListIterator<Hotel> hotelIterator = hoteis.listIterator(hoteis.size());
//		while (hotelIterator.hasPrevious()) {
//			var hotel = hotelIterator.previous();
//			System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
//					hotel.getCidade(), hotel.getPrecoDiaria());
//		}

//		Iterator<Hotel> hotelIterator = hoteis.iterator();
//		while (hotelIterator.hasNext()) {
//			var hotel = hotelIterator.next();
//			System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
//					hotel.getCidade(), hotel.getPrecoDiaria());
//		}

//		for (int i = 0; i < hoteis.size(); i++) {
//			Hotel hotel = hoteis.get(i);

//		}
	}

}