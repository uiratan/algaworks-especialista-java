import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {

	public static void main(String[] args) {
		Path arquivo = Path.of("/mnt/wsl/PHYSICALDRIVE1/java/algaworks/ej/excecoes_16/excecoes/teste.txt");
		BufferedReader reader = null;

		try {
			reader = Files.newBufferedReader(arquivo);
			System.out.println(reader.readLine());

		} catch (IOException e) {
			System.out.println("Erro ao criar arquivo: " + e.getMessage());

		} finally {

			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("Erro fechando leitor de arquivo");
			}

		}

	}
}
