package src.br.com.xti.poo;

public class ContaTest {
	public static void main(String[] args) {
		
		Conta conta = new Conta("Narciso",10000.0);
		conta.exibeSaldo();
		
		Conta destino = new Conta("Caio", 8000.0);
		destino.exibeSaldo();
		
		conta.transferePara(destino, 1550.0);
		
		conta.exibeSaldo();
		destino.exibeSaldo();
		
	}
}
