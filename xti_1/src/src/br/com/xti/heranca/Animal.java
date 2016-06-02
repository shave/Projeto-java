package src.br.com.xti.heranca;

public class Animal {
	public double peso;
	public String comida;
	
	public Animal(){
		
	}
	public Animal(double peso, String comida) {
		this.peso = peso;
		this.comida = comida;
	}

	void dormir() {System.out.println("Dormiu");}
	void fazerBarulho() {System.out.println("Fazer Barulho!!");}

}
