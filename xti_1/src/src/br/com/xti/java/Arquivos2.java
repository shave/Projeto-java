package src.br.com.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import src.br.com.xti.poo.Conta;

public class Arquivos2{

	Path path = Paths.get("D:/Estudo/workspace/xti/files/contas.txt");
	Charset utf8 = StandardCharsets.UTF_8;

	public void armazenar(ArrayList<Conta> contas) {
		/* escrevendo o arquivo */
		try (BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
			for (Conta c : contas) {
				// adicionando e colocando uma quebra de linha.
				w.write(c.toString() + " \n");

			}

		} catch (IOException e1) {
			e1.getStackTrace();
		}
	}

	public void pegarContas(ArrayList<Conta> lendoContas) {
		
		try (BufferedReader r = Files.newBufferedReader(path, utf8)) {
			String line = null;
			String re = null;
			String d1 = null;
			String d2 = null;

			while ((line = r.readLine()) != null) {

				if (line.matches("(\\w+)\\s(\\d+.\\d{2})\\s")) {
					re = "(\\w+)\\s(\\d+.\\d{2})\\s";
					d1 = line.replaceAll(re, "$1");
					d2 = line.replaceAll(re, "$2");
					// System.out.println("Antes: " + line + " Depois: "+ d1
					// +" "+d2);
					lendoContas.add(new Conta(d1, d2));
				}
			}
		} catch (IOException e) {
			e.getStackTrace();
		}

	}

	public static void main(String[] args) {

		ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new Conta("Ricardo", 12000.23));
		contas.add(new Conta("Lawrence", 11050.32));
		contas.add(new Conta("Sandra", 18000.21));
		contas.add(new Conta("Beatriz", 23200.09));
		
		ArrayList<Conta> lendoContas = new ArrayList<>();
		for (Conta conta : lendoContas) {
			System.out.println(conta.toString());
		}

	}
}

