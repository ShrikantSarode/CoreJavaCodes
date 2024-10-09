package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

	public static void main(String[] args) {
		Date d = new Date();
//		System.out.println(d);
		
		//to format the date
		SimpleDateFormat ft1 = new SimpleDateFormat("E yyy.MM.dd ' at ' hh:mm:ss a");
		//class          obj                             format
		SimpleDateFormat ft2 = new SimpleDateFormat(" yyy 'year' ");
		SimpleDateFormat ft3 = new SimpleDateFormat(" MM 'month' ");
		SimpleDateFormat ft4 = new SimpleDateFormat(" dd 'date' ");
		System.out.println(ft1.format(d));
		System.out.println(ft2.format(d));
		System.out.println(ft3.format(d));
		System.out.println(ft4.format(d));
	}
}
