import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.ContaInvestimento;
import com.algaworks.banco.Titular;

public class PrincipalToString {
	public static void main(String[] args) {
		Titular titular = new Titular("Uiratan", "64915956334");
		Titular titular1 = null;

		Conta conta = new Conta(titular, 123, 999999);
		ContaInvestimento contaInvestimento = new ContaInvestimento(titular, 1234, 999999);
		ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 999999, 90);

		System.out.println(conta);
		System.out.println(contaInvestimento);
		System.out.println(contaEspecial);

		System.out.println(titular1);
	}
}
