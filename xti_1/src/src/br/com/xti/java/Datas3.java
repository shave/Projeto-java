package src.br.com.xti.java;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas3 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		Date date = c.getTime();
		
		//Locale padrao = Locale.getDefault();
		Locale india = new Locale("hi","IN");
		 
		
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL, india);
		System.out.println(f.format(date));
		
	}

}
