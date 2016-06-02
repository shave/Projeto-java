package src.br.com.xti.java;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		
		int tamanho = 50;
		
		for (int i = 0; i < tamanho; i++) {
			System.out.print(a + ", ");
			c =a+b; 
			a = b;
			b = c;
			
		}
		
	}
}
