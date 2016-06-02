package src.br.com.xti.heranca;

public class Ave extends Animal{
	
	public Ave(double peso, String comida) {
		super(peso, comida);
	}
	
	public void voar(){System.out.println("Voando");}
	public void botar(){System.out.println("Botou!");}

}
