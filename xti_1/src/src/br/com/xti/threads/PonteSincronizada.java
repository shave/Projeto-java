package src.br.com.xti.threads;

public class PonteSincronizada implements Ponte{
	
	private int valor = -1;

	@Override
	public synchronized void set(int valor) throws InterruptedException {
		System.out.print("Produziu " + valor);
		this.valor = valor;
	}

	@Override
	public synchronized int get() throws InterruptedException {
		System.err.print("Consumiu " + valor);
		return valor;
	}

}
