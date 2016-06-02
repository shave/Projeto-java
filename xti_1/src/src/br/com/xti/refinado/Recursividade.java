package src.br.com.xti.refinado;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursividade {
	public static int soma(int x){
		if(x == 0){
			return 0;
		}else{
			return x + soma(x-1);
		}
	}
	
	public static int potencia(int x, int e){
		if(e == 1){
			return x;
		}else{
			return x * potencia(x, e-1); 
		}
	}
	
	public static void listar(Path path){
		if(Files.isRegularFile(path)){
			System.out.println(path.toAbsolutePath());
		}else{
			System.out.println(path.toAbsolutePath());
			try {
				DirectoryStream<Path> stream = Files.newDirectoryStream(path);
				for (Path p : stream) {
					listar(p);
				}
			} catch (IOException e) {} 
		}
		
	}
	
	public static void main(String[] args) {
		//System.out.println(soma(10));
		//System.out.println(potencia(3, 4));
		listar(Paths.get("C:/xti/"));
	}
}
