package enumpac;

enum Month1 {
	JAN, FEB, MAR, APR, MAY;
}

public class EnumDemo2 {

	public static void main(String[] args) {
		Month1 m1 = Month1.JAN;
		System.out.println(m1);

		switch (m1) {
		case JAN:
			System.out.println("This is first month of the year..");
			break;
		case FEB:
			System.out.println("This is wonderful month..");
			break;
		case MAR:
			System.out.println("This month complete the project..");
			break;
		case APR:
			System.out.println("This Month Exam ..");
			break;
		case MAY:
			System.out.println("Let us to go Travel the new places..");
			break;
		}
	}
}
