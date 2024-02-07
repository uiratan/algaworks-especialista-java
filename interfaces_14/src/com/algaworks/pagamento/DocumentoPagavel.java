package src.com.algaworks.pagamento;

public interface DocumentoPagavel {
	// em interfaces: public abstract é opcional

	public abstract double getValorTotal();

	Beneficiario getBeneficiario();

}
