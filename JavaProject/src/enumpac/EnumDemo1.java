package enumpac;

interface Interface1 {
	String comp = "OFS";

	public void fun1();
}

//1st method:-outside class
enum Months implements Interface1 {
	JAN, FEB, MAR, APR, MAY;

	@Override
	public void fun1() {
		System.out.println("This is Fun1 ()");

	}

}

public class EnumDemo1 {
//2st method:-inside class
//	enum Months{
//		JAN,FEB,MAR,APR,MAY;
//	}
	public static void main(String[] args) {
		// 3rd method:-inside main
//		enum Months{
//			JAN,FEB,MAR,APR,MAY;
//		}
		Months m1 = Months.FEB;
		Months m2 = Months.JAN;
		Months m3 = Months.MAR;
		Months m4 = Months.MAY;

		System.out.println(Months.APR);
		Months m = Months.JAN;
//Months user data type and m is variable
		m.fun1();
//		System.out.println("m1= "+m1);
//		System.out.println("m2= "+m2);
//		System.out.println("m3= "+m3);
//		System.out.println("m4= "+m4);

		for (Months month : Months.values()) {
			System.out.println("Month: " + month);
		}

		// Months months = new Months(); cannot be instantiated
	}
}
