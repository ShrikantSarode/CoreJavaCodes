package enumpac;

enum Days {
	MON, TUES, WED, THRU, FRI;
}

public class EnumAssign {

	public static void main(String[] args) {

		Days D = Days.TUES;
		System.out.println(D);
		System.out.println("=======================");
		
		for(Days days:Days.values()) {
			System.out.println(days);
		}
		System.out.println("=======================");

		switch (D) {
		case MON:
			System.out.println("This is Monday");
			break;
		case TUES:
			System.out.println("This is Tuesday");
			break;
		case WED:
			System.out.println("This is Wednesday");
			break;
		case THRU:
			System.out.println("This is Thrusday");
			break;
		case FRI:
			System.out.println("This is Friday");
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + D);
		}

	}
}
