import modelo.Caminhao;
import modelo.CarroParticular;
import modelo.ImovelResidencial;
import service.ServicoPropostaSeguro;

public class Principal {
	public static void main(String[] args) {
		var servicoPropostaSeguro = new ServicoPropostaSeguro();

		var carroParticular = new CarroParticular("HR-V", 2022, 150_000);
		var caminhao = new Caminhao("Actros", 2021, 780_000, 4);
		var imovelResidencial = new ImovelResidencial(2_300_000, 320);

		servicoPropostaSeguro.emitir(carroParticular);
		servicoPropostaSeguro.emitir(caminhao);
		servicoPropostaSeguro.emitir(imovelResidencial);
	}
}
