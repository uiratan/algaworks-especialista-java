import com.algaworks.financeira.modelo.Funcionario;
import com.algaworks.financeira.service.ServicoPagamentoBonus;

public class Principal2 {

	public static void main(String[] args) {
		var funcionario = new Funcionario("João da Silva", 18_000);
		ServicoPagamentoBonus servicoPagamentoBonus = new ServicoPagamentoBonus();
		servicoPagamentoBonus.pagar(funcionario, 100);
	}
}
