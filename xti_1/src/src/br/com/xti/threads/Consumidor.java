package src.br.com.xti.threads;

import java.util.Random;

public class Consumidor implements Runnable {
	
	private Ponte ponte;
	private Random random = new Random();
	public Consumidor(Ponte ponte){
		this.ponte = ponte;
	}

	@Override
	public void run() {
		int total = 0;
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(random.nextInt(3000));
				total+= i ;
				ponte.get();
				System.err.println(total);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
