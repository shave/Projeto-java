package src.br.com.xti.threads;

public interface Ponte {

	void set(int valor) throws InterruptedException;

	int get() throws InterruptedException;

}
