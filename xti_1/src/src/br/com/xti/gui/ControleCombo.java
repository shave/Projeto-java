package src.br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ControleCombo extends JFrame{
	
	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("fotos/1.jpg")),
			new ImageIcon(getClass().getResource("fotos/2.jpg")),
			new ImageIcon(getClass().getResource("fotos/3.jpg")),
			new ImageIcon(getClass().getResource("fotos/4.jpg"))
	}; 

	public ControleCombo() {
		super("Album de Fotos");
		
		Container c = getContentPane();
		
		combo = new JComboBox<String>();
		combo.setFont(new Font("Serif", Font.PLAIN, 26));
		combo.addItem("Fam¨ªlia");
		combo.addItem("Manga");
		combo.addItem("Banana");
		combo.addItem("Choro");
		
		label = new JLabel(imagens[0]);
		
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 530);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ControleCombo();
	}

}
