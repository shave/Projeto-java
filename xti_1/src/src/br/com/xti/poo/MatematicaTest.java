package src.br.com.xti.poo;

public class MatematicaTest {
	public static void main(String[] args) {
		Matematica m = new Matematica();
		
		System.out.print(m.media(5, 3));
		System.out.println( );
		System.out.print(m.media("50", "30"));
		
		int i = m.raiz(144);
		System.out.println(i);
		
		/*int maoir = m.maior(10, 20);
		System.out.println(maoir);
		
		double so = m.soma(10, 20);
		System.out.println(so);
		
		int par = m.maior(2, 4);
		int impar =m.maior(3, 5);
		double soa = m.soma(par, impar);
		System.out.println(soa);
		*/
	}
}
