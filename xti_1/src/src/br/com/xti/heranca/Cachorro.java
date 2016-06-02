package src.br.com.xti.heranca;

public class Cachorro extends Animal{

	public Cachorro(double peso, String comida) {
		super(peso, comida);
	}
	
	public Cachorro() {
		// TODO Auto-generated constructor stub
	}

	void enterrarOssos(){System.out.println("Enterrou...");}
	@Override
	public void fazerBarulho() {
		super.fazerBarulho();
		System.out.println("Au, Au, Au!!!");
	}

}
