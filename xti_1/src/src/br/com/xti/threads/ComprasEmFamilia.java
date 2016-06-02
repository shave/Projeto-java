package src.br.com.xti.threads;

public class ComprasEmFamilia implements Runnable{

	ContaConjunta conta = new ContaConjunta();
	
	public static void main(String[] args) {
		ComprasEmFamilia irAsCompras = new ComprasEmFamilia();
		
		new Thread(irAsCompras, "Pai").start();
		new Thread(irAsCompras, "Mãe").start();
		new Thread(irAsCompras, "Filha").start();
		new Thread(irAsCompras, "Babá").start();
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
