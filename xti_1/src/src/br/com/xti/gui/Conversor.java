 package src.br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Conversor extends JFrame {

	private JPanel contentPane;
	private JTextField valor;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Conversor() {
		setTitle("Conversor de Temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 225);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnConversor = new JButton("Converter");
		btnConversor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				double fahrenheit = Double.parseDouble(valor.getText());
				double celsius = (fahrenheit - 32)/ 1.8;
				resultado.setText(celsius + " ��C");
				}catch(Exception erro){}
			}
		});
		btnConversor.setFont(new Font("Tahoma", Font.PLAIN, 26));
		contentPane.add(btnConversor, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Fahrenheit: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		valor = new JTextField();
		valor.setFont(new Font("Tahoma", Font.PLAIN, 26));
		valor.setEditable(true);
		panel.add(valor);
		valor.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Celsius:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		resultado = new JTextField();
		resultado.setFont(new Font("Dialog", Font.PLAIN, 26));
		resultado.setText("");
		panel.add(resultado);
		resultado.setColumns(10);
	}

}
