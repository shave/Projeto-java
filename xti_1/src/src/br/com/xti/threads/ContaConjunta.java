package src.br.com.xti.threads;

public class ContaConjunta {
	private int saldo = 100;
	
	public int getsaldo(){
		return saldo;
		}
	
	public void sacar(int valor, String cliente){
		if (saldo >= valor) {
			int saldoOriginal = saldo;
			System.out.println(cliente + " vai sacar");
			try {
				System.out.println(cliente + " esperando");
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			saldo -= valor;
			System.out.print(cliente + " sacou " + valor + "[Saldo Original =" + saldoOriginal +  ", Saldo Final =" + saldo +"]");
		} else{
			System.out.println("Saldo insuficiente para " + cliente);
			}
 	}

}
