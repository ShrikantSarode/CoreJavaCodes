package date;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateDemo4 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);

		TimeZone t = TimeZone.getTimeZone("CST");
		Calendar cal = Calendar.getInstance(t);

		int day1 = cal.get(Calendar.DAY_OF_MONTH);
		int day2 = cal.get(Calendar.DAY_OF_WEEK);
		int day3 = cal.get(Calendar.DAY_OF_YEAR);
		int m1 = cal.get(Calendar.HOUR);
		int m2 = cal.get(Calendar.MINUTE);
		int m3 = cal.get(Calendar.SECOND);
		int m4 = cal.get(Calendar.MILLISECOND);

		System.out.println("Day of Month -> " + day1);
		System.out.println("Day of Week -> " + day2);
		System.out.println("Day of Year -> " + day3);
		System.out.println("Hours ->  " + m1);
		System.out.println("Minu  -> " + m2);
		System.out.println("Sec  -> " + m3);
		System.out.println("Mili  -> " + m4);
		System.out.println(day1 + "/" + day2 + "/" + day3 + " Time-->" + m1 + ":" + m2 + ":" + m3 + ":" + m4);

	}
}
