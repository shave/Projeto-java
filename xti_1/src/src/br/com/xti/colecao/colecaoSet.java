package src.br.com.xti.colecao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class colecaoSet {

	public static void main(String[] args) {
			String [] cores = {"verde", "amarelo", "azul",
					"branco", "azul","amarelo","verde"};
			List<String> list = Arrays.asList(cores);
			System.out.println(list);
			
			Set<String> set = new HashSet<>(list);
			System.out.println(set);
	}

}
