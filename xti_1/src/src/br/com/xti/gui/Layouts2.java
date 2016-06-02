package src.br.com.xti.gui;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Layouts2 extends JFrame{

	public Layouts2() {
		super("Minha Janela");
		/*
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(5,5));//espacamento por elementos
		c.add(BorderLayout.NORTH, new JButton("N"));
		c.add(BorderLayout.SOUTH, new JButton("S"));
		c.add(BorderLayout.WEST, new JButton("W"));
		c.add(BorderLayout.EAST, new JButton("E"));
		c.add(BorderLayout.CENTER, new JButton("C"));
		
		c.setLayout(new GridLayout(2,3));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		*/
		
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4,1));
		c2.add(new JButton("OK"));
		c2.add(new JButton("Cancel"));
		c2.add(new JButton("Setup..."));
		c2.add(new JButton("Help"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Layouts2();
	}

}
