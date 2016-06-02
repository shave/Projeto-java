package src.br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CalculadoraTest extends JFrame{
	
	JTextField display;
	JButton um, dois, tres, quatro, cinco, seis, sete, oito,nove, zero, igual, mais, menos, dividir, multiplicar, ponto;
	
	public CalculadoraTest(){
		super("Calculadora");
		
		
		display = new JTextField();
		display.setFont(new Font("serif", Font.PLAIN, 26));
		
		
		//iniciando os botoes.
		um = new JButton("1");
		dois = new JButton("2");
		tres = new JButton("3");
		quatro = new JButton("4");
		cinco = new JButton("5");
		seis = new JButton("6");
		sete = new JButton("7");
		oito = new JButton("8");
		nove = new JButton("9");
		zero = new JButton("0");
		igual = new JButton("=");
		mais = new JButton("+");
		menos = new JButton("-");
		dividir = new JButton("/");
		multiplicar= new JButton("*");
		ponto = new JButton(".");
		
		Container c = getContentPane();// espaco da calculadora
		c.setLayout(new BorderLayout());
		
		
		Container teclado = new JPanel();// linhas e colounas
		Font fonte = new Font("serif", Font.PLAIN, 24);
		teclado.setFont(fonte);
		//entrada de texto			
		teclado.setLayout(new GridLayout(4,4,5,5));
		teclado.add(sete);
		teclado.add(oito);
		teclado.add(nove);
		teclado.add(dividir);
		teclado.add(quatro);
		teclado.add(cinco);
		teclado.add(seis);
		teclado.add(multiplicar);
		teclado.add(um);
		teclado.add(dois);
		teclado.add(tres);
		teclado.add(menos);
		teclado.add(zero);
		teclado.add(ponto);
		teclado.add(igual);
		teclado.add(mais);
		
		
		
		
		
		//Adicionando a calculadora.
		c.add(BorderLayout.NORTH, display);
		c.add(BorderLayout.CENTER, teclado);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CalculadoraTest();

	}

}
