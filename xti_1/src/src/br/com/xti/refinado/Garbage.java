package src.br.com.xti.refinado;

import java.util.ArrayList;
import java.util.List;

public class Garbage {
	public static long carregarMemoria(){
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100_000; i++) {
			list.add(i);
		}
		return Runtime.getRuntime().freeMemory();
	}
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		int mb = 1_048_576;
		double total = rt.maxMemory()/mb;
		
		double inicio = total - (carregarMemoria()/mb);
		
		System.out.println(total);
		System.out.println(inicio);
		
		
	}

}
