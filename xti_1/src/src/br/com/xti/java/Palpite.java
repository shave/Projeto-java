package src.br.com.xti.java;

import java.util.Random;

import javax.swing.JOptionPane;

/** 
 * qual o palpite?
 * qual o valor do dado?
 * palpite est¨¢ correto?
 * */
public class Palpite {
	
	public static void main(String[] args) {
		
		int [] dado = {1,2,3,4,5,6};
		
		//seleciona o n¨²mero random
		Random r =new Random();
		
		int b = r.nextInt(dado.length);
		
		
		String p = JOptionPane.showInputDialog(null, "Digite seu N¨²mero");
		 
		int a =Integer.parseInt(p);
		
		if (b == a) {
			JOptionPane.showMessageDialog(null, "Parabens voce acertou !" +" Palpite = " + p + " Dado = "+ b);
			
		} else {
			
			JOptionPane.showMessageDialog(null, "Boa sorte tente novamente!" +"Palpite = " + p + " Dado = "+ b);
		}
	
		
	}

}
