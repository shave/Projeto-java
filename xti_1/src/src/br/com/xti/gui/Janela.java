package src.br.com.xti.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela {
	
	public Janela() {
		JFrame frame = new JFrame();
		JButton botao = new JButton("Clique");
		frame.getContentPane().add(botao);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		
		new Janela();
		
	}

}
