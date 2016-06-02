package src.br.com.xti.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class ControleTest extends JFrame{
	
	JTextField login;
	JPasswordField senha;
	JButton ok, cancel;
	
	public ControleTest(){
		super("Texto e Senhas");
		
		login = new JTextField();
		senha = new JPasswordField();
		
		ok = new JButton("Ok");
		ok.addActionListener((ActionListener) this);
		cancel = new JButton("Cancel");
		cancel.addActionListener((ActionListener) this);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 2));
		c.add(new JLabel("Login:"));
		c.add(login);
		c.add(new JLabel("Senha:"));
		c.add(senha);
		c.add(ok);
		c.add(cancel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
	}

	public static void main(String[] args) {
			new ControleTest();
		
	}
	
	class BotaoOkListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String s = "Login: " + login.getText()
					+ "\nsenha: " + new String(senha.getPassword());
			JOptionPane.showMessageDialog(null, s);			
		}		
	}

	class BotaoCancelListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			login.setText("");
			senha.setText("");			
		}
	}
	
}

