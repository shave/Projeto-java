package src.br.com.xti.colecao;

import java.util.ArrayList;
import java.util.List;

public class ColecaoList {

	public static void main(String[] args) {
			List<String> list = new ArrayList<>();
			list.add("Futebol");
			list.add("Basquete");
			list.add("T¨ºnis");
			list.add("Volei");
			list.add("Natacao");
			list.add("Hockey");
			list.add("Boxe");
			list.add("Futebol");
			
			System.out.println(list);
			
			for (int i = 0; i < list.size(); i++) {
				String letra = list.get(i);
				list.set(i, letra.toUpperCase());
			}
			
			System.out.println(list);
			
			System.out.println(list.indexOf("BOXE"));
			list.subList(2, 4).clear();			
	}

}
