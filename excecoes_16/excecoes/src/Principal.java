import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {

	public static void main(String[] args) {
		Path arquivo = Path.of("/mnt/wsl/PHYSICALDRIVE1/java/algaworks/ej/excecoes_16/excecoes/teste.txt");

		try {
			Files.createFile(arquivo);
		} catch (IOException e) {
			System.out.println("Erro ao criar arquivo: " + e.getMessage());
			e.printStackTrace();
		}

		System.out.println(arquivo);
	}
}
