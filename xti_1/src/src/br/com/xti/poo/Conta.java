package src.br.com.xti.poo;

public class Conta {
	private String cliente;
	private double saldo;
	
	public Conta(){}
	public Conta(String cliente, double saldo){
		this.cliente = cliente;
		this.saldo = saldo;
	}
	public Conta(String cliente, String saldo){
		this.cliente = cliente;
		this.saldo = Double.parseDouble(saldo);
		
	}
	
	public void exibeSaldo(){
		System.out.println(this.cliente + " seu saldo иж = "+this.saldo);
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public void transferePara(Conta destino, double valor){
		this.saca(valor);
		destino.deposita(valor);
	}
	
	@Override
	public String toString() {
		String to = this.cliente + ";" + this.saldo;
		return to;
	}
	
	

}
