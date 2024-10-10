package lambdaexpression;

interface Interface2 {
	void abs(double x);

	default void fun1() {
		System.out.println("This is Fun1");
	}
}

public class Myclass2 {

	public static void main(String[] args) {

		Interface2 fobj2 = (double x)->System.out.println("Cube of Number is : "+x*x*x);
		fobj2.abs(3);
		fobj2.fun1();
	}
}
