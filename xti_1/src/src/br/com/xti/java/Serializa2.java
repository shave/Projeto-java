package src.br.com.xti.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import src.br.com.xti.poo.Conta;

public class Serializa2 {

	public void armazenar(ArrayList<Conta> contas) throws FileNotFoundException, IOException {

		try (FileOutputStream fos = new FileOutputStream(
				"D:/Estudo/workspace/xti/files/contas.ser")) {
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(contas);
			}
		}
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Conta> pegarContas() throws ClassNotFoundException, FileNotFoundException, IOException {
		try (FileInputStream fis = new FileInputStream(
				"D:/Estudo/workspace/xti/files/contas.ser")) {
			try (ObjectInputStream ois = new ObjectInputStream(fis)) {
				return (ArrayList<Conta>) ois.readObject();
			}
		}

	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		 ArrayList<Conta> contas = new ArrayList<>(); 
		 contas.add(new Conta("Ricardo", 12000.23));
		 contas.add(new Conta("Lawrence", 11050.32));
		 contas.add(new Conta("Sandra", 18000.21)); 
		 contas.add(new Conta("Beatriz", 23200.09));
		 
		Serializa2 operacao = new Serializa2();
		 operacao.armazenar(contas);

		ArrayList<Conta> conta = operacao.pegarContas();
		for (Conta conta2 : conta) {
			conta2.exibeSaldo();
		}

	}
}
