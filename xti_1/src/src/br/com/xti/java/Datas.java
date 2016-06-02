package src.br.com.xti.java;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas {
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		Date date = c.getTime();
		
		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(date));
		
		f = DateFormat.getTimeInstance();
		System.out.println(f.format(date));
		
		 f = DateFormat.getDateTimeInstance();
		System.out.println(f.format(date));
		
	}

}
