package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {

	public static void main(String[] args) {
		Date d = new Date();
		
		SimpleDateFormat sf1 = new SimpleDateFormat("d'/'MM'/'YYYY");
		SimpleDateFormat sf2 = new SimpleDateFormat("d MMM YYYY");
		SimpleDateFormat sf4 = new SimpleDateFormat("d MMM YYYY hh:mm:ss a z");
		SimpleDateFormat sf3 = new SimpleDateFormat("d MMMM YYYY ");
		System.out.println(sf1.format(d));
		System.out.println(sf2.format(d));
		System.out.println(sf4.format(d));
		System.out.println(sf3.format(d));
	}
}
