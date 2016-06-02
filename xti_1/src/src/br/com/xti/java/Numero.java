package src.br.com.xti.java;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numero {
	public static void main(String[] args) throws ParseException {
		double saldo = 123_456.789;
		NumberFormat f = NumberFormat.getInstance();
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getIntegerInstance();
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getPercentInstance();
		System.out.println(f.format(0.25));
		
		f = NumberFormat.getCurrencyInstance();
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getInstance(Locale.US);
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getInstance(Locale.FRANCE);
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getInstance();
		System.out.println( f.parse("R$ 1.100,25"));
		
	}

}