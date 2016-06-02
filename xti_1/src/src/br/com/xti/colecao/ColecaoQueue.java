package src.br.com.xti.colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {
		//FIFO = primeiro a entrar  eo primeiro a sair
		Queue<String> fila = new LinkedList<>();
		fila.add("Ricardo");
		fila.add("Sandra");
		fila.offer("Beatriz");
		System.out.println(fila);
		
		System.out.println(fila.peek());
		
		System.out.println(fila.poll());//remove o elemento da fila
		System.out.println(fila);
		
		/*outro metodos disponiveis em linkedList*/
		
		LinkedList<String> f = (LinkedList<String>) fila;
		f.addFirst("Caio");//coloco no inicio da fila.
		f.addLast("Juliana"); // coloca no fim da fila
		System.out.println(f);
		
		System.out.println(f.peekFirst());
		System.out.println(f.peekLast());
		
	}

}
