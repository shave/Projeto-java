package src.br.com.xti.heranca;

public class AnimalTest {
	public static void main(String[] args) {
		Cachorro toto = new Cachorro();
		toto.comida = "Carne";
		toto.dormir();
		toto.fazerBarulho();
		
		Galinha carijo = new Galinha(20, "milho");
		carijo.dormir();
		carijo.fazerBarulho();
	}
}
