package src.br.com.xti.colecao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

	public static void main(String[] args) {
			
		Map<String,String> pais = new HashMap<>();
		pais.put("BR", "Brasil");
		pais.put("RU", "Rússia");
		pais.put("IN", "Índia");
		pais.put("CN", "China");
		System.out.println(pais); 
		
		pais.containsKey("BR"); //procusa pela chave
		pais.containsValue("Brasil"); //procura pelo valor
		System.out.println(pais.get("CN")); //pegar pela chave
		pais.remove("RU");// remove pela chaves
		
		Set<String> keys = pais.keySet();
		for (String key : keys) {
			System.out.println(pais.get(key));
			
		}
	}

}
