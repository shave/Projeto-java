package src.br.com.xti.poo;

public class Carro {
	
	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	Motor motor;
	
	public Carro() {
		
	}
	
	public Carro(String modelo,	int velocidadeMaxima, double segundosZeroACem, Motor motor){
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
	}

}
