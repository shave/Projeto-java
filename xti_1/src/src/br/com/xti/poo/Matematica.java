package src.br.com.xti.poo;

public class Matematica {
	
	double media(int x){
		System.out.println("double media(int x)");
		return x;
	}
	double media(int x , int y){
		System.out.println("double media(int x , int y)");
		return (x + y) / 2;
	}
	
	double media(double ... numeros){
		System.out.println("double()");
		return this.soma(numeros)/numeros.length;
	}
	
	double media(String x, String y){
		System.out.println("media(String x, String y)");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix + iy) /2;
	}

	int raiz (int numero){
		int r = 0;
		int impar = 1;
		while (numero >= impar) {
			numero -= impar;
			r++;
			impar += 2;
			
		}
		return r;
	}
	public int maior(int um, int dois) {
		if (um > dois) {
			return um;
		} else {
			return dois;
		}

	}

	public double soma(double ... numeros) {
		double total = 0;
		for (double n : numeros) {
			total += n;
		}
		return total;
	}

}
