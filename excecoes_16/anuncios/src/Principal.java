public class Principal {

	public static void main(String[] args) {
		var anuncio = new ServicoCadastroAnuncio();
		anuncio.cadastrar("999", "teste");

		System.out.println("Anuncio cadastrado");
	}
}
