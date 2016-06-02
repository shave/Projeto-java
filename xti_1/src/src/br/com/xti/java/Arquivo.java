package src.br.com.xti.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {
	public static void main(String[] args) throws IOException {
		//Java 7
		Path path = Paths.get("D:/Estudo/workspace/xti/files/texto.txt");
		System.out.println(path.toAbsolutePath());
		
		Files.createDirectories(path.getParent());
		byte[] bytes = "Meu texto".getBytes();
		Files.write(path, bytes);
		
	}
}
