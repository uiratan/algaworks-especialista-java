import com.algaworks.crm.CadastroCliente;
import com.algaworks.crm.Cliente;
import com.algaworks.crm.Filtro;

public class Principal {
	public static void main(String[] args) {
		var cadastroCliente = new CadastroCliente();
		cadastroCliente.adicionar(new Cliente("João", 30));
		cadastroCliente.adicionar(new Cliente("Maria", 90));
		cadastroCliente.adicionar(new Cliente("Sebastião", 50));
		cadastroCliente.adicionar(new Cliente("Joaquina", 45));
		cadastroCliente.adicionar(new Cliente("Josefina", 25));

		var filtro = new Filtro<Cliente>() {
			@Override
			public boolean avaliar(Cliente cliente) {
				return cliente.getIdade() > 40;
			}
		};

//		var clientes = cadastroCliente.getClientes();
		var clientes = cadastroCliente.consultar(filtro);

		for (Cliente cliente : clientes) {
			System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
		}

	}

}
