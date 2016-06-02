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

public class Arquivo3 {

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

	public ArrayList<Conta> pegarContas() {
		ArrayList<Conta> contas = new ArrayList<>();
		try (BufferedReader r = Files.newBufferedReader(path, utf8)) {
			String line = null;

			while ((line = r.readLine()) != null) {
				String[] t = line.split(";");
				Conta conta = new Conta(t[0], Double.parseDouble(t[1]));
				contas.add(conta);

			}
		} catch (IOException e) {
			e.getStackTrace();
		}
		return contas;
	}

	public static void main(String[] args) {

		ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new Conta("Ricardo", 12000.23));
		contas.add(new Conta("Lawrence", 11050.32));
		contas.add(new Conta("Sandra", 18000.21));
		contas.add(new Conta("Beatriz", 23200.09));

		Arquivo3 operacao= new Arquivo3();
		operacao.armazenar(contas);


		ArrayList<Conta> conta = operacao.pegarContas();
		for (Conta conta2 : conta) {
			conta2.exibeSaldo();
		}

	}
}
