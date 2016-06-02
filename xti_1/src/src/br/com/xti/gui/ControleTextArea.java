package src.br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class ControleTextArea extends JFrame implements ActionListener{
	
	public ControleTextArea() {
		super("Editor de Textos");
		
		JTextArea texto = new JTextArea();
		JScrollPane scroll = new JScrollPane(texto);
		texto.setFont(new Font("Serif", Font.PLAIN, 26));
		
		JButton botao = new JButton("Abrir Arquivo");
		botao.setFont(new Font("Serif", Font.PLAIN, 26));
		botao.addActionListener(this);
		
		Container c = getContentPane();
		c.add(BorderLayout.CENTER, scroll);
		c.add(BorderLayout.SOUTH, botao);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ControleTextArea();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser c = new JFileChooser();
		c.showOpenDialog(this);
	}

}
